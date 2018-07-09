package unit13;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpcaseChanger {

    public static void main(String[] args) {
        String str = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
        String upcaseStr = changeToUpcase(str);
        System.out.println(upcaseStr);

    }

    public static String changeToUpcase(String str) {
        final String upcaseTagRegex = "<upcase>(.*?)</upcase>";
        String result = str;
        Pattern pattern = Pattern.compile(upcaseTagRegex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            result = result.replaceFirst(upcaseTagRegex, matcher.group(1).toUpperCase());
        }

        return result;
    }

}
