import java.util.Scanner;
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
    String cannedResponses[] = {"Okay.","Well then.", "Whatever you say!", "Mhm...", "Awesome!", "Suuuure."};

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
      String testInp = userInput.toUpperCase();
      //Check if the user input contains any of the mirror words.
      if (testInp.contains("YOU")|| testInp.contains(" I ") || testInp.contains("I ") || testInp.contains("ME") || testInp.contains("AM") || testInp.contains("ARE") || testInp.contains("MY") || testInp.contains("YOUR")) {
        // for loop
        for (int k = 0; k < arrOfInput.length; k++) {
          // Iterate through each word in the array, checking for each mirror word. Change to the mirror of the word if found.
          String currentWord = arrOfInput[k].toUpperCase();
          if (currentWord.equals("YOU")) {
            arrOfInput[k] = "I";
          } else if (currentWord.equals("I")) {
            arrOfInput[k] = "you";
          } else if (currentWord.equals("ME")) {
            arrOfInput[k] = "you";
          } else if (currentWord.equals("AM")) {
            arrOfInput[k] = "are";
          } else if (currentWord.equals("ARE")) {
            arrOfInput[k] = "am";
          } else if (currentWord.equals("MY")) {
            arrOfInput[k] = "your";
          } else if (currentWord.equals("YOUR")) {
            arrOfInput[k] = "my";
          }
          String mirror = String.join(" ", arrOfInput);
          response = mirror + "?";
        }
      } else { // If the user input contains no mirror words, simply use a canned response.
        String canned = (cannedResponses[r]);
        response = (canned);
      }
      chatTranscript.add(response);
    System.out.println(response);
}
// Print a goodbye statement.
System.out.println("Goodbye! :)" + "\n");
chatTranscript.add("Goodbye! :)");

// Print a transcript of the conversation by iterating through and printing each part of the array list.
System.out.println("--- CHAT TRANSCRIPT:");
for (int line = 0; line < chatTranscript.size(); line++) {
  System.out.print(chatTranscript.get(line) + "\n");
}
// Close the Scanner called "input".
input.close();
}
}