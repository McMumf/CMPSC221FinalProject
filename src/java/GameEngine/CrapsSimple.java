

package ex1416;
import java.util.Random;

/**
 *
 * @author Alex Conway
 * @version 1.0 
 */
public class CrapsSimple {
    
    private int die1,
                die2,
                sum,
                point,
                gameState,
                winState;
    
    private String winStatus,
                   status;
    
    private static final Random rng = new Random();
    
    public CrapsSimple() {
        die1 = 0;
        die2 = 0;
        sum = 0;
        point = 0;
        
    }
    
    public void internalRollDice() {
        die1 = 1 + rng.nextInt(6);
        die2 = 1 + rng.nextInt(6);
        
        sum = die1 + die2;
    }
    
    public int firstRoll() {
        internalRollDice();
        
        switch (sum) {
            case 7:
            case 11:
                gameState= 0;
                winState = 1;
                winStatus = "You win.";
                break;
            case 2:
            case 3:
            case 12:
                gameState = 0;
                winState = 0;
                winStatus = "You lost.";
                break;
            default:
                gameState = 1;
                winState = 2;
                winStatus = "Roll again.";
                setPointInner();
                break;
        }
        
        return winState;
    }
    
    public int nextRoll() {
        internalRollDice();
        
        if (sum == point) {
            gameState = 0;
            winState = 1;
        }
        else if (sum == 7) {
            gameState = 0;
            winState = 0;
        }
        else {
        }

        return winState;    
    }
    
    public void rollDice() {
        
        if (gameState == 0) {
                
                winState = firstRoll();
                
                switch (winState) {
                    case 1:
                        status = "You win.";
                        break;
                    case 0:
                        status = "You lose.";
                        break;
                    default:
                        status = "Roll again.";
                        //point = game.getPoint();
                        //pointT.setText("" + point);
                        break;
                }
           }
        else {
                
                winState = nextRoll();
               
                switch (winState) {
                    case 1:
                        status = "You win.";
                        //pointT.setText("");
                        break;
                    case 0:
                        status = "You lose.";
                        //pointT.setText("");
                        break;
                    default:
                        status = "Roll again.";
                        break;
                }
            }
    }
    
    public int getDie1() {
        return die1;
    }
    public int getDie2() {
        return die2;
    }
    public int getSum() {
        return sum;
    }
    public int getPoint() {
        point = die1 + die2;
        return point;
    }
    public void setPointInner() {
        point = die1 + die2;
    }
    public int getGameState() {
        return gameState;
    }
    public String getWinStatus() {
        return winStatus;
    }
    public String getGameStat(){
        return status;
    }
}
