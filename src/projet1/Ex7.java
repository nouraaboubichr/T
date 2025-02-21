package projet1;

public class Ex7 {

	public static void main(String[] args) {
		int[][] T = {
	            {2, 5},      
	            {1, 2, 3, 4},        
	            {1, 1, 3}    
	        };
	         int maxSomme=0;
	         int ligneMax=0;
	         for(int i=0 ; i<T.length ;i++){
	             int sum=0;
	            for(int num:T[i]){
	                sum +=num;
	            }
	           if(sum>maxSomme){
	               maxSomme=sum;
	               ligneMax=i;
	           }
	         }
	        System.out.println("la somme max de la ligne --> "+(ligneMax+1)+" est: "+maxSomme);
	}

}

