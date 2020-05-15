import javax.swing.JOptionPane;
public class Contractor {

    //input Contractor information
    String name = JOptionPane.showInputDialog("Enter Contractor's name: ");
    int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter Contactor's phone number: "));
    String email = JOptionPane.showInputDialog("Please enter the Contractors email address: ");
    String address = JOptionPane.showInputDialog("Please enter physical address of the Contractor: ");

    Contractor(String name, int num, String email, String address){

    }
    Contractor(){

    }
}
