package uni11;

import java.util.Random;

public class Advertising5 {

    public static void main(String[] args) {

        String [] phrases = {"Продуктът е отличен.", "Това е страхотен продукт.",
                "Постоянно ползвам този продукт.", "Това е най- добрият продукт от тази категория."};
        String [] experiences = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
                "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
        String [] firstName = {"Диана", "Петя", "Стела", "Елена", "Катя"};
        String [] secondName = {"Иванова", "Петрова", "Кирова"};
        String [] city = {"София", "Пловдив", "Варна", "Русе", "Бургас"};

        Random rand = new Random();
        int phraseNum = rand.nextInt(phrases.length);
        int experiencesNum = rand.nextInt(experiences.length);
        int firstNameNum = rand.nextInt(firstName.length);
        int secondNameNum = rand.nextInt(secondName.length);
        int cityNum = rand.nextInt(city.length);

        System.out.printf("%s %s \n   %s %s, %s",phrases[phraseNum],experiences[experiencesNum],
                firstName[firstNameNum],secondName[secondNameNum],city[cityNum]);
    }

}
