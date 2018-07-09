class MostFrequentFinder {

    public static void main(String[] args) {	
        int[] tab = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab.length;
        int[] freq = new int[11];  
        int c;

        for(int i=0; i<taille; i++){	
            c = tab[i];
        	++freq[c];  	
        }    
        for(int i=0; i<freq.length; i++){
        	System.out.println( i +"\t"+freq[i]);
        }
        
	// here was the error, if it's freq.length with i+1 on the last step you go out of bounds
        int t=0, highest=0;
        for(int i=0; i<freq.length - 1; i++){
        	c = freq[i+1];	
        	if(freq[i] < c){
        		
        		highest = c;
        	}
        }
        int h =0;
        for ( int i = 0; i < freq.length; i++) {
            if (freq[i] == highest) {
                t=i;
                h++;
            }
        }
        if(h==1){
        	System.out.println("Il n'y a pas un tel element");
        }
         System.out.println("L'element le plus frequent est " + tab[t]);
    }
}

    
    /*public static int findIndex(int[] arr, int element) {
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        
        return -1;
    }*/