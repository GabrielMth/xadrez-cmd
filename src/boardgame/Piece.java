package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; // se eu não atribuir nada por padrão o java já atribui mas too colocando para enfatizar
	}


	protected Board getBoard() {
		return board;
	}
	
}
