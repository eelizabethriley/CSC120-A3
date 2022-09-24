import java.util.Scanner;
import java.util.Arrays;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    // Ask the user how many rounds they would like to "chat" for.
    Scanner input = new Scanner(System.in); 
    System.out.println("How many rounds?");
    Integer rounds = input.nextInt();

    // Start the conversation with a greeting and a question.
    System.out.println("Hi there! What's on your mind?");
    input.nextLine();

    // Continue the conversation for the number of rounds inputted.
    for (int i = 0; i <= rounds; i++) {
      //  Take in the user response for each round.
      String userInput = input.nextLine();
      // Split the response into an array of strings, seperating the words by spaces.
      String [] arrOfInput = userInput.split(" ", 50);
      for (int k = 0; k < arrOfInput.length; k++) {
        if (arrOfInput[k].equals("you") || arrOfInput[k].equals("You")) {
          // arrOfInput[k].replace("you", "I");
          arrOfInput[k] = "I";
        }
        if (arrOfInput[k].equals("I")) {
          // arrOfInput[k].replace("I", "you");
          arrOfInput[k] = "I";
        }
        else {
          System.out.println("Okay.");
        }
      }
      
     String words = Arrays.toString(arrOfInput);
      for (int w = 0; w < arrOfInput.length; w++) {
        System.out.print(words);
      }
    }
    input.close();
    // Take in the input given by the user in response
    // If the input contains mirror words, convert the words to their mirror and return the altered string.
    // Otherwise, return a canned response.

  }
}
