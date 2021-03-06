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
	public void grilleAuCommencementBParLigne(){
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
				+ "........\n"
				+ "...BW0..\n"
				+ "..0WB...\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		
		assertEquals(output,reversi.printLegalMoves(input));
	}
	
	@Test
	public void grilleAuCommencementWParLigne(){
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
				+ "........\n"
				+ "..0BW...\n"
				+ "...WB0..\n"
				+ "........\n"
				+ "........\n"
				+ "........\n"
				+ "W";
		
		assertEquals(output,reversi.printLegalMoves(input));
	}
	/*
	@Test
	public void grilleAuCommencementBParCol(){
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
		
		output = ""
				+ "........\n"
				+ "........\n"
				+ "....0...\n"
				+ "...BW...\n"
				+ "...WB...\n"
				+ "...0....\n"
				+ "........\n"
				+ "........\n"
				+ "B";
		
		assertEquals(output,reversi.printLegalMoves(input));
	}*/
	
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
