package projet1;

import java.util.HashSet;
import java.util.Set;

public class Ex5 {

	public static boolean estPermutation(int[][] matrice) {
        int n = matrice.length;
        int taille = n * n;
        Set<Integer> ensemble = new HashSet<>();

        // Parcourir la matrice et ajouter chaque élément à l'ensemble
        for (int[] ligne : matrice) {
            for (int valeur : ligne) {
                // Vérifier si la valeur est dans la plage attendue et non dupliquée
                if (valeur < 1 || valeur > taille || !ensemble.add(valeur)) {
                    return false;
                }
            }
        }
        return ensemble.size() == taille;
    }

    public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        if (estPermutation(matrice)) {
            System.out.println("C'est une permutation.");
        } else {
            System.out.println("Ce n'est pas une permutation.");
        }
    }
}
