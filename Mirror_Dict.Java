import java.util.*;

// I was curious if it would be possible to create a dictionary in Java as in python, so I found some
// websites explaining how to set up a dictionary class. I referenced the following link
// https://www.educative.io/answers/java-dictionary and came up with the given code.

/** A dictionary class Mirrior Dictionary that stores key/value pairs of the "mirror words", where the key is the word that
 * would be replaced by its value, the mirror of it.
*/
class Mirror_Dict {

    public static void main(String[] args) {
        MirrorWords<String, String> mirr_dict = new MirrorWords<String,String();
        mirr_dict.put("I", "you");
        mirr_dict.put("me", "you");
        mirr_dict.put("am", "are");
        mirr_dict.put("you", "I");
        mirr_dict.put("my", "your");
        mirr_dict.put("your", "my");
    }
}