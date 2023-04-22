package com.psl.gems.card;

import java.util.List;

import com.psl.gems.PackOfCard.Pack;

public class Card {
	
	
	

	private String suit;
	private String number;
	
	public Card() {
		
	}
	
	public Card(String suit, String number) {
		super();
		this.suit=suit;
		this.number=number;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return  suit + "-"+ number;
	}
	public  static int calculateValue(Card card) {
		String s=card.getSuit();
		String n=card.getNumber();
		int rank_weight=Pack.getNameOnCard().indexOf(n);
		int suit_weight=0;
		switch(s) {
		case "Spades":
			suit_weight=3;
			break;
		case "Hearts":
			suit_weight=2;
			break;
		case "Diamonds":
			suit_weight=1;
			break;
		case "Clubs":
			suit_weight=0;
			break;
		default:
			break;
			
		}
		return rank_weight*4+suit_weight;
		
	}
	
	public  static Card maxCard(List<Card> cardsInHand) {
		
		Card max=cardsInHand.get(0);
		for(int i=1;i<cardsInHand.size();i++) {
			Card c=cardsInHand.get(i);
			
			if(Card.calculateValue(max)<Card.calculateValue(cardsInHand.get(i)));
			{
				max=cardsInHand.get(i);
			}
		}
		return max;
	}
	
}
