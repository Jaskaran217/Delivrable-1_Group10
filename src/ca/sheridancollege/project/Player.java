/**
 * Player class
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jaskaran Kaur, Komalpreet Kaur, Jasmeen Kaur, Prinka 
 *          March 2024
 */
public class Player {

   //Fields:
//hand (List of Cards)   
//score (set constructor to 0)  
//name
    
    List<Card> hand = new ArrayList<Card>();
    int score;
    String name; //the unique name for this player

  
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    
//method to display the info about the player and list of cards the player has
    
    public void describe(){
        System.out.println(name + " has the following cards: ");
        System.out.println();
        for (Card card : hand) {
            card.describe();
        }
            //to separate the players   
            System.out.println("-----------------------------------");
    }
    
    
//flip method to remove and returns the top card of hand  
    
    public Card flip(){
        Card drawTopCard = hand.get(0);
        hand.remove(0);
        return drawTopCard;
    }

//adding the returned card to hand field
    
    public void draw (GroupOfCards groupofcards){
        Card card = groupofcards.draw();
        hand.add(card);
    }
    
//Incrementing the score after winning the turn(adding 1 to the player's score)  
    
    public void incrementScore(){
        this.score++;
    }
    
//Returning the score
    
    public int getScore(){
        return score;
    }

}
