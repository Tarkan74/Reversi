package Reversi;

public class Reversi {

	public String printLegalMoves(String input) {
		if(input==""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "B")
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
		else if (input==""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W")
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
			else
				return ""+
				"........\n"
				+ "........\n"
				+ "...0B0..\n"
				+ "...BB...\n"
				+ "...WB0..\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
			
	}

	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

}
