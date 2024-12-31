//This is a coin flip game. You guess heads or tails and flip a coin to see if you have won.

//importing libraries to use different features that java offers
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Welcome message at the start of the game.
    public static final String greeting = "Welcome to The Coin Flip game!";

    // How to play the game message displayed at the beginning of the game.
    public static final String howTo = "This is a game of chance. You will type in your choice " +
            "of heads or tails and press enter to flip for a chance to win. If your choice shows up you win!";

    // Method to get our game started
    public static void startGame() {
        // Start the game with greeting our player
        System.out.println(greeting);

        // Display instructions on how to play the game
        System.out.println(howTo);

        // Start the game play
        gameLogic();
    }

    // Game play logic. The set of instructions we will use to play our game.
    public static void gameLogic() {
        try{
            // Set a value to true to keep our while loop going until we want to stop
            boolean running = true;

            //A scanner gets the players typed in choice for us
            Scanner input = new Scanner(System.in);
            //We ask them to type in their choice heads or tails.
            System.out.print("Type your choice of heads or tails and press enter to try your luck: ");

            //Generates a random number 0 or 1 (0 will be heads and 1 will be tails). This is used as the coin flip.
            Random randomNumberGenerator  = new Random();
            //We will store our 0 or 1 in the variable randomNumber to determine if player has won or lost.
            int randomNumber = randomNumberGenerator.nextInt(2);

            //Start of our game loop to get players choice and determine if they have won or lost.
            while(running) {
                //Here we get the players choice of heads or tails and store it inside choice.
                String choice = input.nextLine().toLowerCase();
                //Here we will check if the player has chosen heads or tails.
                if (choice.equals("heads") || choice.equals("tails")) {
                    running = false;
                    //Here we will check if our random number is 0 and if it is we will display that they are a winner.
                    if(randomNumber == 0) {
                        System.out.println("The winner is: Heads");
                        if(choice.equals("heads")) {
                            System.out.println("You are a winner!");
                        }else{
                            //If they chose tails we will tell them they lost.
                            System.out.println("You lose!");
                        }
                        //Here we will check if our random number is 1 and if it is we will display they are a winner.
                    } else if(randomNumber == 1) {
                        System.out.println("The winner is: Tails");
                        if (choice.equals("tails")) {
                            System.out.println("You are a winner!");
                        }else{
                            //if they chose heads we will tell them they lost.
                            System.out.println("You lose!");
                        }
                    }

                }else{
                    //If they chose something that isn't heads or tails we will tell them to try again until they pick heads or tails.
                    System.out.print("Please pick heads or tails: ");
                }
            }
        //If something goes wrong with our game we will display a message letting the user know.
        }catch (Exception e) {
            System.out.println("Sorry! Something went wrong and the game has crashed. Please restart the game to play.");
        //Once our game as been played successfully we will send these messages to the player.
        }finally{
            //Give the player some words of wisdom.
            System.out.println("Gambling is never a sure thing. Only gamble what you can afford to lose.");

            //Thank them for playing and close the game.
            System.out.println("Thank you for playing!");
        }

    }


    public static void main(String[] args) {
        //This is the start of our program and the first thing it will do is run our startGame method to start our game.
        startGame();
    }

}