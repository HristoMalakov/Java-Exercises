
public class MatrixPrinter {
	
    public static void main(String arg[]){
        int tab[][]= {{1,2,3},{4,5,6,7},{8,9}};
        
        for(int line[]:tab){
        	for(int k:line){
        		System.out.print(k+"\t");
        	}
        	System.out.println();
        }
    }
}
























/*int ex[][] = {{1,2,3},{4,5,6,7},{8,9}};

for(int line[]:ex ){
	
    for (int k : line){
    	
        System.out.print("\t"+k);
    }
    
    System.out.println();
}*/