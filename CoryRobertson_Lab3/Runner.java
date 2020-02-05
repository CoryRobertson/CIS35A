import java.util.Scanner;
public class Runner 
{

	public static void main(String[] args) {

	       Scanner in = new Scanner(System.in);
	       TicTacToe game = new TicTacToe();
	       System.out.println("Welcome to Tic-tac-toe");
	       System.out.println("Enter coordinates for your move following the X and O prompts");
	       
	       while(!game.stalemate()) 
	       {
	              game.print();
	              System.out.print(game.getPlayer() + ":");

	              //Loop while the method play does not return true when given their move.
	              //Body of loop should ask for a different move
	              while(!game.play(in.next()))
	              {
	                    System.out.println("Illegal move. Enter your move.");
	                    System.out.print(game.getPlayer() + ":");
	               }
	              //If the game is won, call break;
	              if(game.won())
	                  break;

	              //Switch the turn
	              game.switchTurn();

	        }
	        game.print();
	        if(game.won())
	        {
	             System.out.println("Player "+game.getPlayer()+" Wins!!!!");
	        } 
	        else 
	        {
	             System.out.println("Stalemate");
	        }
	        in.close();
	}
	
}
