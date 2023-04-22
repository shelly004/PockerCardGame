package com.psl.gems.PackOfCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.psl.gems.card.Card;

public class Pack {
	
	private static List<Card> cards;
	private static ArrayList<String> nameOnCard;
	
	
	public static List<Card> getCards() {
		return cards;
	}

	public static void setCards(List<Card> cards) {
		Pack.cards = cards;
	}

	public static ArrayList<String> getNameOnCard() {
		return nameOnCard;
	}

	public static void setNameOnCard(ArrayList<String> nameOnCard) {
		Pack.nameOnCard = nameOnCard;
	}

	public Pack() {
		 cards=new ArrayList<>();
		  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		  nameOnCard=new ArrayList<>();
		  nameOnCard.add("Two");
		  nameOnCard.add("Three");
		  nameOnCard.add("Four");
		  nameOnCard.add("Five");
		  nameOnCard.add("Six");
		  nameOnCard.add("Seven");
		  nameOnCard.add("Eight");
		  nameOnCard.add("Nine");
		  nameOnCard.add("Ten");
		  nameOnCard.add("Jack");
		  nameOnCard.add("Queen");
		  nameOnCard.add("King");
		  nameOnCard.add("Ace");

	        for (String suit : suits) {
	            for (int i = 0;i<nameOnCard.size();i++) {
	                Card card = new Card(suit, nameOnCard.get(i));
	                cards.add(card);
	            }
	        }
	}
	
	public static void shuffle() {
		Collections.shuffle(cards);
	}
	
	public static Card getTopCard() {
		Card c=cards.get(cards.size()-1);
		cards.remove(c);
		return c;
	}
	
	public static int getSizeOfPack() {
		return cards.size();
	}
	
	public static Card getRandomCard() {
		Random random=new Random();
		Card randomCard=cards.get(random.nextInt(cards.size()));
		cards.remove(randomCard);
		return randomCard;
	}
	
	
	
}
