  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ac3texteditor;

import javax.swing.JFrame;
import javax.swing.UIManager;
/**
 *
 * @author Jonatan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
        UserInterface UI = new UserInterface();
        UI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        UI.setLocation(200, 50);
        UI.setVisible(true);
    }

}
