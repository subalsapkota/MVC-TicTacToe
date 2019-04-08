
public class TicTacToeController {

	private TicTacToeModel model;
	private TicTacToeView view;
	
	public TicTacToeController (TicTacToeModel model, TicTacToeView view) {
		this.model = model;
		this.view = view;
	}
	
	public void GameLogic() {
	      
	    while(hasWon() == false){
	         
	         int row = view.getXUserInputRow();
	         int col = view.getXUserInputCol();
	         if( model.getBoard()[row][col] == 0 )
	        	 model.getBoard()[row][col] = model.getX();
	            
	         view.printBoard();
	         
	         //Check to see if X's move won the game. If so, break out of game loop
	         if( hasWon() == true )
	            break;
	         
	         int Orow = view.getOUserInputRow();
	         int Ocol = view.getOUserInputCol();
	         
	         if( model.getBoard()[Orow][Ocol] == 0 )
	        	 model.getBoard()[Orow][Ocol] = model.getO();
	         
	         view.printBoard();
	   }     
	}
	
	public boolean hasWon() {
		//Variable holds the "result" of hasWon. True if a winner was found.
	      boolean retVal = false;
	      
	      //Check for horizontal win
	      for( int row = 0; row < model.getBoard().length; row++ ){
	         int sum = 0;
	         for( int col = 0; col < model.getBoard()[0].length; col++ ){
	            sum += model.getBoard()[row][col];
	         }
	         //Check to see if the sum of that row was 3 or -3, a win...
	         if( sum == 5 ){
	            view.xWins();
	            retVal = true;
	         } else if ( sum == -5 ) {
	            view.oWins();
	            retVal = true;
	         }
	      }
	      
	    //Check for vertical win
	      for( int col = 0; col < model.getBoard().length; col++ ){
	         int sum = 0;
	         for( int row = 0; row < model.getBoard().length; row++ ){
	            sum += model.getBoard()[row][col];
	         }
	         //Check to see if the sum of that column was 3 or -3, a win...
	         if( sum == 5 ){
	            view.xWins();
	            retVal = true;
	         } else if ( sum == -5 ) {
	            view.oWins();
	            retVal = true;
	         }
	      }
	      
	    //Check for diagonal win
	      if( (model.getBoard()[0][0] + model.getBoard()[1][1] + model.getBoard()[2][2] + model.getBoard()[3][3] + model.getBoard()[4][4]) == 5 ){
	         view.xWins();
	         retVal = true;
	      } else if ( (model.getBoard()[0][0] + model.getBoard()[1][1] + model.getBoard()[2][2] + model.getBoard()[3][3] + model.getBoard()[4][4]) == -5 ) {
	         view.oWins();
	         retVal = true;
	      }
	      if( (model.getBoard()[0][4] + model.getBoard()[1][3] + model.getBoard()[2][2] + model.getBoard()[3][1] + model.getBoard()[4][0]) == 5 ){
	         view.xWins();
	         retVal = true;
	      } else if ( (model.getBoard()[0][4] + model.getBoard()[1][3] + model.getBoard()[2][2] + model.getBoard()[3][1] + model.getBoard()[4][0]) == -5 ) {
	         view.oWins();
	         retVal = true;
	      }
	      
	    //Check for cat game
	      boolean foundSpace = false;
	      for( int row = 0; row < model.getBoard().length; row++ ){
	         for( int col = 0; col < model.getBoard()[0].length; col++ ){
	            if( model.getBoard()[row][col] == 0 ) 
	               foundSpace = true;
	         }
	      }
	      if( foundSpace == false ){
	         view.tie();
	         retVal = true;
	      }
	      
	      return retVal;
	}
	
	
}
