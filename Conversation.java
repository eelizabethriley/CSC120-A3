import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    // Ask the user how many rounds they would like to "chat" for.
    Scanner chatRounds = new Scanner(System.in); 
    System.out.println("How many rounds?");
    Integer rounds = chatRounds.nextInt();
    chatRounds.close();

    // Create a new scanner to take in user response.
    Scanner chatResponse = new Scanner (System.in);

    // Start the conversation with a greeting and a question.
    System.out.println("Hi there! What's on your mind?");
    for (int i = 0; i < rounds+1; i++) {
      String userInput = chatResponse.nextLine();
      
    }


    // Take in the input given by the user in response
    // If the input contains mirror words, convert the words to their mirror and return the altered string.
    // Otherwise, return a canned response.

  }
}
