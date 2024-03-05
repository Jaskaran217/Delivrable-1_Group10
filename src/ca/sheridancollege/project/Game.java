/**
 * War Card Game
 * Creating new group of cards
 * Shuffle the cards to randomized the order of cards
 * Set the players
 * Distributing the cards between players
 * Play the game
 * Declare the winner
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @author Jaskaran Kaur , Komalpreet Kaur, Jasmeen Kaur, Prinka
 *          March 2024
 */
public class Game {
    
//main method 
    public static void main(String[] args){
       
       //Instantiate GroupOfCards and two players and called the shuffle method        

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
       
        
        GroupOfCards groupofcards = new GroupOfCards();
        groupofcards.shuffle();
        
        //loop to iterate 26 cards to each player's hand which equals to 52 cards all together       
        
        for (int i =1; i <= 26; i++){
            player1.hand.add(groupofcards.draw()); //players drawing the cards from groupofcards
            player2.hand.add(groupofcards.draw());
           
        }
        
       //cards will be described after they are drawn
        player1.describe();
        player2.describe();
        
        
        //loop to iterate 26 times for each card for each player and calls the  flip method
        for (int i = 0; i < 26; i++){
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            
           
           //comparing the value of each card returned by the players after flipping 
          //and calls the increment method on player  (who has higher value)
          
            if (player1Card.getCardValue()> player2Card.getCardValue()) {
                player1.incrementScore();
            } else if (player1Card.getCardValue() < player2Card.getCardValue()){
                player2.incrementScore();
            } else {
                System.out.println();
            }
            
        } 
        
        // comparing the final score of the players
        if (player1.score > player2.score){
            System.out.println("Player 1 " +" is the winner!!! With a Score of " + player1.score );
            System.out.println( "Player 2 loses with the score of " + player2.score);
        } else if (player2.score > player1.score) {
            System.out.println("Player 2 "+ " is the winner!!! With a Score of "+ player2.score);
            System.out.println("Player 1 loses with the score of " + player1.score);
        } else {
            System.out.println("It's a tie!!!");
        }
    
    }
}
