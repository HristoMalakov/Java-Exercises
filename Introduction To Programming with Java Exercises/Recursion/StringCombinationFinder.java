package unit10;

public class StringCombinationFinder {

    public static void main(String[] args) {

        String [] strs = {"test","rock","fun"};

        for(int i=0; i<strs.length; i++){
            for(int j=i+1; j<strs.length; j++){
                System.out.printf("\n%s, %s",strs[i],strs[j]);
            }
        }

    }
}
