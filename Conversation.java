import java.util.Scanner;
import java.util.Arrays;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    // Ask the user how many rounds they would like to "chat" for.
    Scanner input = new Scanner(System.in); 
    System.out.println("How many rounds?");
    Integer rounds = input.nextInt();

    // Create a new scanner to take in user response.
    // Scanner chatResponse = new Scanner (System.in);

    // Start the conversation with a greeting and a question.
    System.out.println("Hi there! What's on your mind?");
    input.nextLine();
    // Continue the conversation for the number of rounds inputted.
    for (int i = 0; i <= rounds; i++) {
      //  Take in the user response for each round, checking for mirror words.
      String userInput = input.nextLine();
      String [] arrOfInput = userInput.split(" ", 1);
      for (int k = 0; i < arrOfInput.length; i++) {
        if (arrOfInput[k].equals("you")) {
          arrOfInput[k].replace("you", "I");
        }
        if (arrOfInput[k].equals("I")) {
          arrOfInput[k].replace("I", "you");
        }
      }
      System.out.println(arrOfInput);

      // if (i.contains("I")) {
      //   userInput = "you";
      //   System.out.println("new part" + " rest of line"+"?");
      // } else if (userInput.contains("you")) {
      //   // turn the token of the input that = you into I
      //   userInput = "I";
      //   System.out.println("I + rest of the line"+"?");
      // } else {
      //   System.out.println("Okay.");
      // }

    }
    input.close();
    System.out.println(Arrays.toString(arrOfInput));
    // Take in the input given by the user in response
    // If the input contains mirror words, convert the words to their mirror and return the altered string.
    // Otherwise, return a canned response.

  }
}
