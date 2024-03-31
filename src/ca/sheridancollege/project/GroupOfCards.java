/**
 *GroupOfCards Class
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jaskaran Kaur, Komalpreet Kaur, Jasmeen Kaur, Prinka 
 *          March 2024
 */

public class GroupOfCards {

   //List of Cards
    
    List<Card> groupofcards = new ArrayList<Card>();
  
//Shuffle Method to shuffle the cards (randomized the order of the cards)
    
    public void shuffle() {
        Collections.shuffle(groupofcards);
    }

//playCard method to show the playedCard
    
    public Card playCard(){
        Card playedCard = this.groupofcards.get(0);
        this.groupofcards.remove(0);
        return playedCard;
    }
    
//loop through all the card values and suits to add the whole groupOfCards
    public GroupOfCards(){
        for (int k = 2; k <=14; k++){
            for (int i = 0; i < 4; i++){
              groupofcards.add(new Card(i, k));
            }
        }
    }
    
//getters and setters for getting the cards from groupofcards and setting the order after shuffling
    
    public List<Card> getCards(){
        return groupofcards;
    }
    
    public void setCards(List<Card> groupofcards){
        this.groupofcards = groupofcards;
    }
    
    
//draw method : removes and returns the top card from the cards
    
    public Card draw() {
        if (groupofcards.isEmpty()){
            System.out.println("No more cards.");
        return null;
        } else{
            Card drawTopCard = groupofcards.get(0);
            groupofcards.remove(0);
            return drawTopCard;
        }
        
    }
}
