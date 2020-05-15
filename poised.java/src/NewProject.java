import javax.swing.JOptionPane;

public class NewProject {

    int num = 0;
    //Input information for the new project
    int projNum = Integer.parseInt(JOptionPane.showInputDialog("Enter project number: "));
    String projName = JOptionPane.showInputDialog("Please enter the project name: ");
    String building = JOptionPane.showInputDialog("Please enter the type of building: ");
    int erfnum = Integer.parseInt(JOptionPane.showInputDialog("Please enter erf number: "));
    double totalCost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the total amount for the project: "));
    double paid = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount that has been paid: "));
    String date = JOptionPane.showInputDialog("Please enter the deadline for the project YYY/MM/DD: ");
    String clientName = JOptionPane.showInputDialog("Please enter customer name and surname: ");
    int clientNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the customer's phone number"));
    String clientEmail = JOptionPane.showInputDialog("Please enter the customer's email");
    String clientAdress = JOptionPane.showInputDialog("Please enter physical address of the customer: ");

    int slocation = clientName.indexOf(" ") + 1;
    String clientSurname = clientName.substring(slocation);

    NewProject(int projNum, String projName, String building, int erfnum, double totalCost, double paid, String date,
               String clientName, int clientNum, String clientEmail, String clientAdress){
    }

    public NewProject(int projNum, String projName, String building, String clientAdress, int erfnum, double totalCost, double paid, String date, String clientName, int clientNum, String clientEmail, String clientAdress1) {
    }

    public double getTotalCost() {
        double sum = totalCost - paid;
        return sum;
    }
    NewProject(){

    }
}
