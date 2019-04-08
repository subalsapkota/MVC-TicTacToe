
public class TicTacToeMain {
	
	public static void main (String args[]) {
		//create model,view,controller
		TicTacToeModel model = new TicTacToeModel();
		TicTacToeView view = new TicTacToeView(model);
		TicTacToeController controller = new TicTacToeController(model, view);	
		
		//Start the game
		controller.GameLogic();
	}
}
