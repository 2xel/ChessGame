package Cheese;

import java.util.ArrayList;

import Pieces.Pawn;

public class Board {
	ArrayList<Pawn> whitePawns = new ArrayList<>();
	ArrayList<Pawn> blackPawns = new ArrayList<>();

	void initialize() {
		for (int i = 0; i < 8; i++) {
			addWhitePawn(new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION));
		}
		for (int i = 0; i < 8; i++) {
			addBlackPawn(new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION));
		}
	}

	void addWhitePawn(Pawn pawn) {
		whitePawns.add(pawn);
	}

	void addBlackPawn(Pawn pawn) {
		blackPawns.add(pawn);
	}

	int size() {
		return whitePawns.size() + blackPawns.size();
	}

	Pawn findWhitePawn(int index) {
		return whitePawns.get(index);
	}

	Pawn findBlackPawn(int index) {
		return blackPawns.get(index);
	}

	String getWhitePawnsResult() {
		return getPawnsResult(whitePawns);
	}

	String getBlackPawnsResult() {
		return getPawnsResult(blackPawns);
	}

	private String getPawnsResult(ArrayList<Pawn> pawns) {
		StringBuilder sb = new StringBuilder();
		for (Pawn pawn : pawns) {
			sb.append(pawn.getRepresentation());
		}
		return sb.toString();
	}

	private String getBlankLine() {
		return "........";
	}

	void print() {
		StringBuilder sb = new StringBuilder();
		sb.append(getBlankLine());
		sb.append('\n');
		sb.append(getBlackPawnsResult());
		sb.append('\n');
		sb.append(getBlankLine());
		sb.append('\n');
		sb.append(getBlankLine());
		sb.append('\n');
		sb.append(getBlankLine());
		sb.append('\n');
		sb.append(getBlankLine());
		sb.append('\n');
		sb.append(getWhitePawnsResult());
		sb.append('\n');
		sb.append(getBlankLine());
		System.out.println(sb.toString());
	}
}
