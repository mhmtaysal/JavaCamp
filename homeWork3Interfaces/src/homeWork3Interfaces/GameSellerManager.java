package homeWork3Interfaces;

import java.util.Scanner;

public class GameSellerManager {
	
	public void buyGame(Game game, Gamer gamer) {
		Scanner klavye = new Scanner(System.in);
		System.out.println(game.name +" " + game.price + "TL dir.");
		System.out.println("Sat�n almak istiyor musun?");
		
		
		String klavyeGirisi = klavye.next();
		
		if(klavyeGirisi.equals("evet")) {
			System.out.println(gamer.nickname + " oyunu sat�n ald�n�z.");
			System.out.println("Sat�n ald�n�z oyun:" + game.name);
		}else {
			System.out.println("Yine bekleriz");
		}
		
	
	
	}

}
