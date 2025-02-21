package projet1;

import java.util.LinkedList;
import java.util.Queue;

public class Ex9 {

	static class Position {
        int x, y, distance;

        Position(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public static int bfs(int[][] labyrinthe, int startX, int startY) {
        int rows = labyrinthe.length;
        int cols = labyrinthe[0].length;
        
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        boolean[][] visite = new boolean[rows][cols];
        Queue<Position> queue = new LinkedList<>();

        queue.add(new Position(startX, startY, 0));
        visite[startX][startY] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

           
            if (labyrinthe[current.x][current.y] == 2) {
                return current.distance;
            }

            
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < rows && newY < cols &&
                    labyrinthe[newX][newY] != 0 && !visite[newX][newY]) {
                    
                    visite[newX][newY] = true;
                    queue.add(new Position(newX, newY, current.distance + 1));
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[][] labyrinthe = {
            {3, 1, 0, 1},  
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 1, 2}  
        };

        int startX = 0, startY = 0; 
        int result = bfs(labyrinthe, startX, startY);

        if (result != -1) {
            System.out.println("Le chemin le plus court a une longueur de " + result + ".");
        } else {
            System.out.println("Aucun chemin trouvé.");
        }
    }

}

