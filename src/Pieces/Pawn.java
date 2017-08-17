package Pieces;

public class Pawn {
	private String color;
	private char representation;
	public static final String WHITE_COLOR = "white";
	public static final String BLACK_COLOR = "black";
	public static final char WHITE_REPRESENTATION = 'p';
	public static final char BLACK_REPRESENTATION = 'P';
	
	public Pawn() {
		color = WHITE_COLOR;
		representation = WHITE_REPRESENTATION;
	}
	
	public Pawn(String color, char representation){
		this.color = color;
		this.representation = representation;
	}
	
	//색깔 출력
	public String getColor() {
		return color;
	}
	
	//representation 출력
	public char getRepresentation() {
		return representation;
	}
}
