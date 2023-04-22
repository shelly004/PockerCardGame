package com.psl.gems.PockerCardGame;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.psl.gems.Players.Player;
import com.psl.gems.game.Game;

public class Start {

	public static void main(String[] args) {
		// code by shelly nema
		
		String player1="Aditya";
		String player2="Gritav";
		
		Player p1=new Player(player1);
		Player p2=new Player(player2);
		
		Game.register(p1);
		Game.register(p2);
		System.out.println("Welcome to the PockerCard Game!!");
		System.out.println("Lets Start the Game!...");
		
		Game.play();
		
		StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html lang=\"en\">\n");
        sb.append("<head>\n");
        sb.append("<title>Document</title>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<section>\n");
        
            sb.append("<div id=\"" + p1.getName() + "\">\n");
            sb.append("<h2>" + p1.getName()+" got below Cards." + "</h2>\n");
            sb.append("<div data-card=\"" + p1.getCardInHand().get(0) + "\"></div>\n");
            sb.append("<h4>" + p1.getCardInHand().get(0) + "</h2>\n");
            sb.append("<div data-card=\"" + p1.getCardInHand().get(1) + "\"></div>\n");
            sb.append("<h4>" + p1.getCardInHand().get(1) + "</h2>\n");
            sb.append("<div data-card=\"" + p1.getCardInHand().get(2) + "\"></div>\n");
            sb.append("<h4>" + p1.getCardInHand().get(2) + "</h2>\n");
            sb.append("</div>\n");
            
            sb.append("<div id=\"" + p2.getName() + "\">\n");
            sb.append("<h2>" + p2.getName()+" got below Cards." + "</h2>\n");
            sb.append("<div data-card=\"" + p2.getCardInHand().get(0) + "\"></div>\n");
            sb.append("<h4>" + p2.getCardInHand().get(0) + "</h2>\n");
            sb.append("<div data-card=\"" + p2.getCardInHand().get(1) + "\"></div>\n");
            sb.append("<h4>" + p2.getCardInHand().get(1) + "</h2>\n");
            sb.append("<div data-card=\"" + p2.getCardInHand().get(2) + "\"></div>\n");
            sb.append("<h4>" + p2.getCardInHand().get(2) + "</h2>\n");
            sb.append("</div>\n");
            sb.append("<h2>" + "The winner of the Game is : " + Game.declareWinner()+ "Hurrrayy!!!"+"</h2>\n");
  
        sb.append("</section>\n");
        sb.append("</body>\n");
        sb.append("</html>\n");
		
		
        String Path = "C:\\Users\\Shelly Nema\\Desktop\\card.html";

        try {
            FileWriter writer = new FileWriter(Path);
            writer.write(sb.toString());
            writer.close();
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the data.");
            e.printStackTrace();
        }
		
		
		

	}

}
