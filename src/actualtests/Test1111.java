package actualtests;/*
package actualtests;

// Given an input string, anonymize PII like name, emails. Keep the code extensible for other patterns as well.


//import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1111 {

    //Set<String> set = new HashSet<>();

    //maskLogs(event);



}

class MaskPattern {

    String mask = "******";

    private String maskLogs(String event) {
        Set<String> nameSet = new HashSet<>();
        nameSet.add("aditya");
        nameSet.add("xyz");// call to external system

        int atIndex = event.indexOf('@');
        if (atIndex > 0) {
            return mask;
        }

        //phone -

        if (event.length() == 10 && checkPhoneNumber(event)) return mask;


        if (nameSet.contains(event)) {
            //mask it

            for (int i = 0; i < event.length(); i++) {
                return mask;
            }


            IntStream.range(0, event.length())
                    .mapToObj(count -> mask)
                    .collect(Collectors.joining());


        } else return event;

    }

    private boolean checkPhoneNumber(String event) {

        char[] charArray = event.toCharArray();
        for (int i = 0; i < event.length(); i++) {

             if(Character.isDigit(charArray[i])) {
                 if (i == event.length()) return true;
                 continue;
             }
        }
         return false;

    }

}
*/
