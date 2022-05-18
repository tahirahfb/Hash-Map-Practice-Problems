import java.util.*;

public class Nicknames {
    public static void main(String[] args) throws Exception {

        /*
        Exercise 1: 

        In the main-method create a new HashMap<String,String> object. Store the names and nicknames of the following people in this hashmap so, that the name is the key and the nickname is the value. Use only lower case letters.

        matthew's nickname is matt
        michael's nickname is mix
        arthur's nickname is artie
T       hen get Matthew's nickname from the hashmap, and print it.
        */
        
        HashMap<String, String> nickNames = new HashMap<>();

        nickNames.put("matthew", "matt");
        nickNames.put("michael", "mix");
        nickNames.put("arthur", "artie");

        System.out.println(nickNames.get("matthew"));
    }
}
