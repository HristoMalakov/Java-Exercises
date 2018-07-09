public class VowelPrinter {
	
    public static void main(String arg[]){
    	
        char vowel[] = {'a','e','i','o','u'};
        System.out.println("vowel elements:");
        
        for(char v:vowel){
            System.out.print ("\t"+v);
        }
        
        System.out.println();
        
        char tmp[] = new char[vowel.length+1];
        System.arraycopy(vowel, 0, tmp, 0, vowel.length);
        
        tmp[tmp.length-1]= 'y';
        vowel = tmp;
        
        System.out.println("vowel elements:");
        
        for(char v:vowel){
            System.out.print ("\t"+v);
        }
        System.out.println();
    }
}