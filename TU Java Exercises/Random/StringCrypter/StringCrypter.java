
public class StringCrypter {
	static String[] CharOnly(String s[], String aCoder[]) {
        for ( int i = 0; i < s.length; i++) {
        	aCoder[i] = s[i].replaceAll("[^a-zA-Z]", "");                    
        }
        return aCoder;
    }
	
	static String[] Codage(String[] chaineCodee, String[] aCoder) {
        for ( int i = 0; i < chaineCodee.length; i++) {
        	chaineCodee[i] = aCoder[i].replaceAll("[^a-zA-Z]", "");                    
        }
        return chaineCodee;
    }
}
