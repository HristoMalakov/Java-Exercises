package unit13;

import java.net.MalformedURLException;
import java.net.URL;

public class URLHandler {

    public static void main(String[] args) throws MalformedURLException {

        String URLstr = "http://www.devbg.org/forum/index.php";
        String protocolStr = protocolGetter(URLstr);
        String serverStr = serverGetter(URLstr,"//","/");
        String resourceStr = resourceGetter(URLstr,"//","/");


        System.out.printf("Protocol: %s \nServer: %s\nResource: %s",protocolStr,serverStr,resourceStr);
    }

    public static String protocolGetter(String URLstr){
        String protocolArr [] = URLstr.split(":");
        String protocolStr = protocolArr[0];
        return protocolStr;
    }

    public static String serverGetter(String text, String startDelimiter,
                                        String endDelimiter) {
        int start;
        int stop;
        String subStr = "";

        if ((text != null) && (startDelimiter != null) &&
                (endDelimiter != null)) {
            start = text.indexOf(startDelimiter);

            if (start >= 0) {
                stop = text.indexOf(endDelimiter, start + 3);

                if (stop > start) {
                    subStr = text.substring(start+2, stop);
                    //subStr = text.substring(stop+1);
                }
            }
        }
        return subStr;
    }

    public static String resourceGetter(String text, String startDelimiter,
                                        String endDelimiter) {
        int start;
        int stop;
        String subStr = "";

        if ((text != null) && (startDelimiter != null) &&
                (endDelimiter != null)) {
            start = text.indexOf(startDelimiter);

            if (start >= 0) {
                stop = text.indexOf(endDelimiter, start + 3);

                if (stop > start) {
                    //subStr = text.substring(start+2, stop);
                    subStr = text.substring(stop);
                }
            }
        }
        return subStr;
    }

}
