package projet1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex10 {

	static final int MUR = 0;
    static final int CHEMIN = 1;
    static final int SORTIE = 2;

    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] genererLabyrinthe(int taille) {
        int[][] labyrinthe = new int[taille][taille];
        for (int[] ligne : labyrinthe) Arrays.fill(ligne, MUR);

        Random rand = new Random();
        List<Position> murs = new ArrayList<>();

        int startX = rand.nextInt(taille);
        int startY = rand.nextInt(taille);
        labyrinthe[startX][startY] = CHEMIN;
        ajouterMursAutour(startX, startY, murs, labyrinthe);

        while (!murs.isEmpty()) {
            int index = rand.nextInt(murs.size());
            Position mur = murs.remove(index);
            int x = mur.x, y = mur.y;

            if (compterVoisinsChemin(x, y, labyrinthe) == 1) {
                labyrinthe[x][y] = CHEMIN;
                ajouterMursAutour(x, y, murs, labyrinthe);
            }
        }

        labyrinthe[taille - 1][taille - 1] = SORTIE;
        return labyrinthe;
    }

    private static void ajouterMursAutour(int x, int y, List<Position> murs, int[][] labyrinthe) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int[] d : directions) {
            int nx = x + d[0], ny = y + d[1];
            if (estDansLabyrinthe(nx, ny, labyrinthe) && labyrinthe[nx][ny] == MUR) {
                murs.add(new Position(nx, ny));
            }
        }
    }

    private static int compterVoisinsChemin(int x, int y, int[][] labyrinthe) {
        int count = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int[] d : directions) {
            int nx = x + d[0], ny = y + d[1];
            if (estDansLabyrinthe(nx, ny, labyrinthe) && labyrinthe[nx][ny] == CHEMIN) {
                count++;
            }
        }
        return count;
    }

    private static boolean estDansLabyrinthe(int x, int y, int[][] labyrinthe) {
        return x >= 0 && y >= 0 && x < labyrinthe.length && y < labyrinthe[0].length;
    }

    public static void afficherLabyrinthe(int[][] labyrinthe) {
        for (int[] ligne : labyrinthe) {
            for (int caseLab : ligne) {
                System.out.print(caseLab + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int taille = 5; 
        int[][] labyrinthe = genererLabyrinthe(taille);
        afficherLabyrinthe(labyrinthe);
    }

}
