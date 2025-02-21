package projet1;
import java.util.Arrays;
public class Ex3 {

	public static void main(String[] args) {
		 int[] tableau = {3, 8, 5, 2, 4, 7}; 

	        int countPairs = 0;
	        for (int num : tableau) {
	            if (num % 2 == 0) 
	              countPairs++;
	        }

	        int[] pairs = new int[countPairs];
	        int[] impairs = new int[tableau.length - countPairs];

	        int i = 0, j = 0;
	        for (int num : tableau) {
	            if (num % 2 == 0) {
	                pairs[i++] = num;
	            } else {
	                impairs[j++] = num;
	            }
	        }

	        int k = 0;
	        for (int num : pairs) tableau[k++] = num;
	        for (int num : impairs) tableau[k++] = num;

	        System.out.println("Tableau après tri : " + Arrays.toString(tableau));
	}

}
