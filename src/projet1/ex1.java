package projet1;

public class ex1 {

	public static void main(String[] args) {
		int [] tab={1, 2, 3, 2, 1, 9, 8};
        for(int i=0 ;i<tab.length; i++){
            int count=0;
            for(int j=0 ;j<tab.length; j++){
                if(tab[i]==tab[j]){
                    count++ ;
                }
            }
            if(count==1){
            System.out.println("le nombre unique est:"+tab[i]);
           
            }
        }
	}

}
