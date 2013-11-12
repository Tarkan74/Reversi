package Reversi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReversiTest {

	private Reversi reversi;
	
	@Before
	public void initializeReversi(){
		this.reversi = new Reversi();
	}

	@Test
	public void grilleAuCommencementB(){
		String input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		
		String output = ""+
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
		String input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		
		String output = ""+
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
		String input = ""+
				"........\n"
				+ "........\n"
				+ "....B...\n"
				+ "...BB...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		
		String output = ""+
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
		String input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		assertEquals("B",this.reversi.turnIs(input));
	}
	
	@Test
	public void tourJoueurW(){
		String input = ""+
				"........\n"
				+ "........\n"
				+ "........\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		assertEquals("W", this.reversi.turnIs(input));
	}
}
