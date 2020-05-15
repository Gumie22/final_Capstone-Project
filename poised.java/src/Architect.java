//import javax.swing.*;
import javax.swing.JOptionPane;
public class Architect {

    //Input architect information
    String name = JOptionPane.showInputDialog("Please enter the name of the Architect: ");
    int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Architect's phone number: "));
    String email = JOptionPane.showInputDialog("Please enter email address of the Architect: ");
    String address = JOptionPane.showInputDialog("Please enter the Architect's address: ");

    Architect(String name, int num, String email, String address){

    }
    Architect(){

    }
}
