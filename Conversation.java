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
    String response = "";
    String cannedResponses[] = {"Okay.","Well then.", "Whatever you say!"};
    String mirrorWords[] = {"you", "I", "me"};
    String chatTranscript[] = {};

    // Continue the conversation for the number of rounds inputted.
    for (int i = 0; i <= rounds; i++) {
      // Print the chatbot response for this round.
      System.out.println(response);
      //  Take in the user response for this round.
      String userInput = input.nextLine();
      // Split the response into an array of strings, seperating the words by spaces.
      String [] arrOfInput = userInput.split(" ", 50);
      // if (userInput.contains(mirrorWords));
      for (int k = 0; k < arrOfInput.length; k++) {
        if (arrOfInput[k].equals("you") || arrOfInput[k].equals("You")) {
          // arrOfInput[k].replace("you", "I");
          arrOfInput[k] = "I";
          response = Arrays.toString(arrOfInput);
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
    System.out.println("Goodbye!");
    input.close();

    // Print a transcript of the conversation.

  }
}
