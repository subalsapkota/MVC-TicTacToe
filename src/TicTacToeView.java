import java.util.Scanner;

public class TicTacToeView {
	
	private TicTacToeModel model;
	
	public TicTacToeView (TicTacToeModel model) {
		this.model = model;
	}
	
	public int getXUserInputRow() {
		
		Scanner input = new Scanner(System.in);
		//Get the X player input for row
        System.out.print("X, enter row: ");
        int row = input.nextInt();
        return row;
	}
	
	public int getXUserInputCol() {
		
		Scanner input = new Scanner(System.in);
		//Get the X player input for col
        System.out.print("X, enter column: ");
        int col = input.nextInt();
        return col;
	}
	
	public int getOUserInputRow() {
		
		Scanner input = new Scanner(System.in);
		//Get the O player input for row
        System.out.print("O, enter row: ");
        int row = input.nextInt();
        return row;
	}
	
	public int getOUserInputCol() {
		
		Scanner input = new Scanner(System.in);
		//Get the O player input for col
        System.out.print("O, enter column: ");
        int col = input.nextInt();
        return col;
	}
	
	public void printBoard(){
		for( int row = 0; row < model.getBoard().length; row++ ){
	         for( int col = 0; col < model.getBoard()[row].length; col++ ){
	            // Uses the "global" constants to print out appropriate letter.
	            if( model.getBoard()[row][col] == model.getX())
	               System.out.print("X ");
	            else if(model.getBoard()[row][col] == model.getO())
	               System.out.print("O ");
	            else 
	               System.out.print(". ");
	          }
	          // Goes to new line after printing each row
	          System.out.println("");
	       }
	}
	
	public void xWins() {
		System.out.println("X wins.");
	}
	
	public void oWins() {
		System.out.println("O wins.");
	}
	
	public void tie() {
		System.out.println("Ends in tie");
	}

}
