package Pieces;

public class Pawn {
	private final String color;
	public static final String WHITE_COLOR = "white";
	public static final String BLACK_COLOR = "black";
	
	Pawn() {
		color = WHITE_COLOR;
	}
	
	public Pawn(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
