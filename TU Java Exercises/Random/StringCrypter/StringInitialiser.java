import java.util.Scanner;

public class StringInitialiser {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";
      
        StringCrypter Obj1 = new StringCrypter();
        
        System.out.println("La chaine a coder: \n"+Obj1.CharOnly(s, aCoder)); 
        System.out.println("La chaine apres codage: \n"+Obj1.Codage(chaineCodee, aCoder));
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}

//line[i] = line[i].replaceAll("[^a-zA-Z]", "");
// line[i] = line[i].toLowerCase();