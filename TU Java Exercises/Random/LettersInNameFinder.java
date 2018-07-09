
public class LettersInNameFinder{

    public static void main(String arg[]){
        String names [ ] = {"Rose","Anabelle", "Gerard", "Francoise", "Erik","Constance"},name;
      
        for(boolean ok = false; !ok; ){
            ok=true;                                                // pas d'echanges au debut
            for(int i = 0; i < names.length-1; i++){
            	 if(names[i].length() > (names[i+1].length())){	 
                    name = names[i];                            //changer le places
                    names[i] = names[i+1];
                    names[i+1] = name;
                    ok = false;                                    // l'echange memorisee
                }
            }
        }
        for(String nm:names)
            System.out.println (nm + "\t has "+nm.length()+" letters");
    }
}