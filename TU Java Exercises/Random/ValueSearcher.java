import java.util.*;

public class ValueSearcher {
	
    public static void main(String arg[]){
    	
    	int val,i=0,c=0;
    	Scanner sc = new Scanner(System.in);
        int vowel[] = {1,2,3,4,5,4,8,1};     
        System.out.print("Quelle valeur cherchez-vous?");
        val = sc.nextInt();
        
        for(i=0;i<vowel.length;i++){      	
        	if(val==vowel[i]){		
        		System.out.println("La valeur cherchee: "+val+" trouve en position "+i);
        		c++;
        		break;
        	}
        	if(i<vowel.length){continue;}
        }
        if(c==0){
        System.out.println("Cette valeur n'existe pas? ");}  
    }
    }
    
    
    