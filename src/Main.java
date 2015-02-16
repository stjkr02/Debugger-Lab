/**
 * This class is a simple driver to run one pig game.  It could 
 * be used more generally to answer more interesting questions.
 * e.g. What is the average number of turns for all cutoffs
 * between 10 and 30?
 */
public class Main
{
  public static void main(String[] args)
  {
    int[] values = {10, 15, 20, 25};
    
    for (int i = 0; i < values.length; i++){
      // Create a new game 
      PigGame g = new PigGame(values[i]);
      
      // Run one game
      g.playGame();
      
      // Output the results
      //System.out.println(g.getScore());
      //System.out.println(g.getNumTurns());
      //System.out.println(g.getTurnAverage());
      
      //My Output
      System.out.println("| " + values[i] + " | " + g.getTurnAverage()+ " |");
    }
  }
}