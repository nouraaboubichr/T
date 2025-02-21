package projet1;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {

	static int[][] labyrinthe = {
	        {1, 1, 0, 1},
	        {0, 1, 1, 0},
	        {1, 0, 1, 1},
	        {1, 1, 1, 2}
	    };
	    
	    static int rows = labyrinthe.length;
	    static int cols = labyrinthe[0].length;
	    static List<String> chemin = new ArrayList<>();
	    static boolean[][] visite = new boolean[rows][cols];

	    public static boolean dfs(int x, int y) {
	        
	        if (x < 0 || y < 0 || x >= rows || y >= cols || labyrinthe[x][y] == 0 || visite[x][y]) {
	            return false;
	        }

	       
	        chemin.add("(" + x + ", " + y + ")");
	        visite[x][y] = true;

	        
	        if (labyrinthe[x][y] == 2) {
	            return true;
	        }

	       
	        if (dfs(x, y + 1) || dfs(x + 1, y) || dfs(x, y - 1) || dfs(x - 1, y)) {
	            return true;
	        }

	        chemin.remove(chemin.size() - 1);
	        return false;
	    }

	    public static void main(String[] args) {
	        if (dfs(0, 0)) {
	            System.out.println("Chemin trouvé : " + String.join(" → ", chemin));
	        } else {
	            System.out.println("Aucune solution trouvée.");
	        }

	    }
}

