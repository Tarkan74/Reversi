package Reversi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReversiTest {

	private Reversi reversi;
	private String input = "";
	private String output ="";
	
	@Before
	public void initializeReversi(){
		this.reversi = new Reversi();
	}

	@Test
	public void grilleAuCommencementB(){
		input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		
		output = ""+
				"........\n"
				+ "........\n"
				+ "....0...\n"
				+ "...BW0..\n"
				+ "..0WB...\n"
				+ "...0....\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		
		assertEquals(output,reversi.printLegalMoves(input));
	}
	
	@Test
	public void grilleAuCommencementW(){
		input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		
		output = ""+
				"........\n"
				+ "........\n"
				+ "...0....\n"
				+ "..0BW...\n"
				+ "...WB0..\n"
				+ "....0...\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		
		assertEquals(output,reversi.printLegalMoves(input));
	}
	
	@Test public void joueurBJoueC5(){
		input = ""+
				"........\n"
				+ "........\n"
				+ "....B...\n"
				+ "...BB...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		
		output = ""+
				"........\n"
				+ "........\n"
				+ "...0B0..\n"
				+ "...BB...\n"
				+ "...WB0..\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		
		assertEquals(output,reversi.printLegalMoves(input));
	}
	
	@Test
	public void tourJoueurB(){
		input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		assertEquals("B",this.reversi.turnIsAt(input));
	}
	
	@Test
	public void tourJoueurW(){
		input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		assertEquals("W", this.reversi.turnIsAt(input));
	}
}
