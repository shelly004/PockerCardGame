package com.psl.gems.game;

import java.util.ArrayList;
import java.util.List;

import com.psl.gems.PackOfCard.Pack;
import com.psl.gems.Players.Player;
import com.psl.gems.card.Card;


public class Game {
	private  static ArrayList<Player> player_list;
	
	static {
		player_list=new ArrayList<>();
	}
	public static void register(Player p) {
		player_list.add(p);
	}

	public static void play() {
		Pack pack=new Pack();
		
		 Pack.shuffle();  
		 
		 for(int i=0;i<player_list.size();i++) {
			 Player p=player_list.get(i);
			 ArrayList<Card> card_distribution =new ArrayList<>();
			 for(int j=0;j<3;j++) {
				  card_distribution.add(Pack.getTopCard());
				  
			 }
			 p.setCardInHand(card_distribution);		 
		 }
		 
		 
	}

	public static String declareWinner() {
		
		Player winner=player_list.get(0);
		
		for(int i=0;i<player_list.size();i++) {
			
			Player player=player_list.get(i);
			int value_of_winner=Card.calculateValue(Card.maxCard(winner.getCardInHand()));
			int value_of_player=Card.calculateValue(Card.maxCard(player.getCardInHand()));
			
			if(value_of_winner<value_of_player) {
				winner=player;
			}
		}
		return winner.getName();
		
	}
}
