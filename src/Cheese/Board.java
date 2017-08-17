package Cheese;

import java.util.ArrayList;

import Pieces.Pawn;

public class Board {
	ArrayList<Pawn> pawns = new ArrayList<>();

	void add(Pawn color) {
		pawns.add(color);
	}
	int size() {
		return pawns.size();
	}
	Pawn findPawn(int index) {
		return pawns.get(index);
	}

}
