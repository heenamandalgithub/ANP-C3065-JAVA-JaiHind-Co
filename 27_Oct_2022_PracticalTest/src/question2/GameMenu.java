package question2;
import java.util.Scanner;

	public class GameMenu {
	void startGame() {
		System.out.println("start game");
	}
	void displayGameInstruction() {
		System.out.println("display game instruction");
	}
	void exitGame() {
		System.out.println("exit game");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			GameMenu gameMenuObj=new GameMenu();
			System.out.println("1.start the game\n 2.Display game instructions\n 3.exit game");
			Scanner scannerObj=new Scanner(System.in);
		    System.out.println("Enter your choice 1,2,or3");
	        int menuChoice=scannerObj.nextInt();
	        
	        switch(menuChoice) {
	        case 1:
	        	gameMenuObj.startGame();
	        	break;
	        case 2:
	        	gameMenuObj.displayGameInstruction();
	        	break;
	        case 3:
	        	gameMenuObj.exitGame();
	            break;
	            default:
	            	System.out.println("Not a valid choice");
	        }
		}

}
