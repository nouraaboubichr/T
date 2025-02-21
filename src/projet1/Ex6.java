package projet1;

public class Ex6{

    public static void main(String[] args) {
         int[][] T = {
            {2, 3, 1},      
            {4, 5},        
            {6, 7, 8, 9}    
        };
         for(int i=0 ; i<T.length ;i++){
             int sum=0;
            for(int num:T[i]){
                sum +=num;
            }
            System.out.println("somme de la ligne --> "+(i+1)+ " est :" +sum);
         }
    }
}
