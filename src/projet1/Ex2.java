package projet1;

public class Ex2 {

	public static void main(String[] args) {
		int[] tableau = {1, 4, 6, 2, 3, 5, 7,0};
        int cible = 7; 

        System.out.println("Les paires dont la somme est " + cible + " sont :");

        
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] + tableau[j] == cible) {
                    System.out.println("(" + tableau[i] + ", " + tableau[j] + ")");
                }
            }
        }
	}

}

