package Cheese;

import static org.junit.Assert.*;

import org.junit.Test;

import Cheese.Board;
import Pieces.Pawn;

public class BoardTest {
	@Test
	public void create() throws Exception {
		Board board = new Board();

		Pawn white = new Pawn(Pawn.WHITE_COLOR);
		board.add(white);
		assertEquals(1, board.size());
		assertEquals(white, board.findPawn(0));

		Pawn black = new Pawn(Pawn.BLACK_COLOR);
		board.add(black);
		assertEquals(2, board.size());
		assertEquals(black, board.findPawn(1));
	}

}