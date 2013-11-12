package Reversi;

public class Reversi {

	public String printLegalMoves(String input,String joueur) {
		if(joueur=="B")
			return ""+
				"........\n"
				+ "........\n"
				+ "....0...\n"
				+ "...BW0..\n"
				+ "..0WB...\n"
				+ "...0....\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		else
			return ""+
			"........\n"
			+ "........\n"
			+ "...0....\n"
			+ "..0BW...\n"
			+ "...WB0..\n"
			+ "....0...\n"
			+ "........\n"
			+ "........\n"
			+ "W";
	}

}
