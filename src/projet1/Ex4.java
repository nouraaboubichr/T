package projet1;

public class Ex4 {

	public static void main(String[] args) {
		int[][] matrice = {
	            {-2, 1, -3, 4},
	            {-1, 2, 1, -5},
	            {4, -1, 2, 1}   
	        };
	        int maxSomme = 0;
	        int ligneMax = -1;
	        
	        for (int i = 0; i < matrice.length; i++) {
	            int sommeLigne = 0;

	             for (int num : matrice[i]) {
	                sommeLigne += num;
	            }

	            if (sommeLigne > maxSomme) {
	                maxSomme = sommeLigne;
	                ligneMax = i;
	            }
	        }
	        System.out.println("la somme de la ligne est --> " +maxSomme + " de la ligne --> " +ligneMax);

	}

}
