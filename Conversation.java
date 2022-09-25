import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

/**
 * A chatbot that takes in user input and outputs a chat response based on mirror words
 * and predefined canned responses.
 */
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    // Ask the user how many rounds they would like to "chat" for.
    Scanner input = new Scanner(System.in); 
    System.out.println("How many rounds?");
    Integer rounds = input.nextInt();
    input.nextLine();

    // Initialize variables needed for the conversation.
    String response = "";
    String cannedResponses[] = {"Okay.","Well then.", "Whatever you say!", "Mhm...", "Awesome!", "Suuuure"};
    // String mirrorWords[] = {"I", "you", "me", "am", "are", "my", "your"};

    // Initiliaze an Array List "chatTranscript" to store a transcript of the conversation.
    ArrayList<String> chatTranscript = new ArrayList<String>();

    // Start the conversation with a greeting and a question.
    String greeting = "Hi there! What's on your mind?";
    System.out.println(greeting);
    chatTranscript.add(greeting);

    // Continue the conversation for the number of rounds inputted.
    for (int i = 0; i < rounds; i++) {
      //  Take in the user response for this round and add it to the transcript.
      String userInput = input.nextLine();
      chatTranscript.add(userInput);
      Random random = new Random();
      Integer r = random.nextInt(5);

      // Split the response into an array of strings, seperating the words by spaces.
      String [] arrOfInput = userInput.split(" ", 50);

      if (userInput.contains("you")) {
        for (int k = 0; k < arrOfInput.length; k++) {
          if (arrOfInput[k].equals("you") || arrOfInput[k].equals("You")) {
            // arrOfInput[k].replace("you", "I");
            arrOfInput[k] = "I";
            response = Arrays.toString(arrOfInput);
          }
          else if (arrOfInput[k].equals("I")) {
            // arrOfInput[k].replace("I", "you");
            arrOfInput[k] = "you";
            response = Arrays.toString(arrOfInput);
          }
      }
  } else {
      String canned = (cannedResponses[r]);
      response = (canned);
      chatTranscript.add(response);
    }
    System.out.println(response);
}
// Print a goodbye statement.
System.out.println("Goodbye! :)" + "\n");
chatTranscript.add("Goodbye! :)");

// Print a transcript of the conversation.
System.out.println("TRANSCRIPT:");
for (int line = 0; line < chatTranscript.size(); line++) {
  System.out.print(chatTranscript.get(line) + "\n");

}
// Close the Scanner called "input".
input.close();
}
}