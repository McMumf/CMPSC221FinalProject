package GUI;

//import project.WelcomePage;
//import project.GamePage;
//import project.StatusPage;
import GUI.GameInterface;
import javax.swing.JFrame;
/**
 * CMPSC 221 Exercise 14.16
 * Purpose: A Craps game with a GUI
 * 
 * @author Paul Han
 * @version 1.0 3/1/2018
 */
public class GUI2 {

    /**
     * Main method that create the GUI
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        //Create GUI
        /*
        StatusPage rdg = new StatusPage();
        rdg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set size
        rdg.setSize(400,200);
        rdg.setVisible(true);
        
        WelcomePage wp = new WelcomePage();
        wp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set size
        wp.setSize(400,200);
        wp.setVisible(true);
        
        GamePage gp = new GamePage();
        gp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set size
        gp.setSize(400,200);
        gp.setVisible(true);
*/
        GameInterface gi = new GameInterface();
        gi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gi.setSize(500, 300);
        gi.setVisible(true);
        
    }
    
}
