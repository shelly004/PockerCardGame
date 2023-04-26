package com.psl.gems.Players;

import java.util.*;


import com.psl.gems.card.Card;

public class Player {
	
	
	private String name;
	private  List<Card> cardInHand;
	
	public Player(String name) {
		super();
		this.name = name;
		cardInHand = new ArrayList<>();
	}

	public  void addCard(Card card) {
		cardInHand.add(card);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  List<Card> getCardInHand() {
		return cardInHand;
	}

	public  void setCardInHand(List<Card> cardInHand) {
		this.cardInHand = cardInHand;
	}
	
	public  Card getMaxCard(List<Card> cardInHand) {
		return Card.maxCard(cardInHand);
	}
	
}
