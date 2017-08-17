package Pieces;

import static org.junit.Assert.*;

import org.junit.Test;

public class PawnTest {
	@Test
	public void create() {
		verifyPawn("white");
		verifyPawn("black");
	}

	void verifyPawn(String color) {
		Pawn pawn = new Pawn(color);
		assertEquals(color, pawn.getColor());
	}
	
	@Test
	public void create_기본생성자() throws Exception {
		Pawn pawn = new Pawn();
		assertEquals("white", pawn.getColor());
	}
}
