
public class TicTacToeModel {
	
	private  int X;
	private  int O;
	private int [][] board = new int[5][5];
	
	
	
	public TicTacToeModel(){
		X = 1;
		O = -1;
	}
	
	public int getX() {
		return X;
	}
	
	public int getO() {
		return O;
	}

	public int [][] getBoard() {
		return board;
	}
	
	


}
