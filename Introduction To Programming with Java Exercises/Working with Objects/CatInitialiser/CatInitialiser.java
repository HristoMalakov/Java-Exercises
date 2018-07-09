package uni11.newchapter10;

import uni11.chapter10.Cat;
import uni11.chapter10.Sequence;

public class CatInitialiser {

    public static void main(String[] args) {

        Cat Garfield = new Cat("Garfield","orange");
        System.out.printf("The cat %s has %s fur\n",Garfield.getName(),Garfield.getColor());
        System.out.println(Sequence.nextValue());
    }

}
