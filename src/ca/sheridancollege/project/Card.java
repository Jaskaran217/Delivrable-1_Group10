/**
 * Card Class
 * Two fields (Name, Value)
 * Name - (Hearts, Clubs, Diamonds, Spades)
 * Value - (Values of the card from 2-14)
 * getter and setters for name and value fields
 * Describe method to print the information of the card
 */
package ca.sheridancollege.project;

/**
 *
 * @author Jaskaran Kaur, Komalpreet Kaur, Jasmeen Kaur, Prinka   
 *          March 2024
 */

public class Card {
    
//Enum for the Values of cards
    
    public enum Value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }
   

//enum for Suits of card

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    private int cardName;
    private int cardValue;
    
    
    public Card(int cardName, int cardValue){
        this.setCardName(cardName);
        this.setCardValue(cardValue);
    }

// Getters and setters to get names and values of the cards
    
    public void setCardName(int newCardName){
        if (newCardName >= 0 && newCardName <=3) {
            this.cardName = newCardName;
        }
    }
    
    public void setCardValue(int newCardValue){
        if (newCardValue >= 2 && newCardValue <= 14) {
            this.cardValue = newCardValue;}}
    
    
    public int getCardName(){
        return cardName;
    }
    
    public int getCardValue(){
        return cardValue;
    }

    
// toString method give value for camparison of each type of card
    
    public String toString(){

    String[] cardValues = {"", "","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suitNames = {"Clubs", "Diamonds", "Hearts", "Spades"};

    return cardValues[cardValue] + " of " + suitNames[cardName];
}
    
//Method to display the information of the card 
    
   public void describe(){
      System.out.println(this.toString() + "\n");
   }
}
  
