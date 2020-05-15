//This is a java program for a small structural engineering company that helps with the many projects
//They want to ma
//This is a java program for a small structural engineering comp
//This is a java program for a small structural engineering company
//that they can use to keep track of the many projects on which they work

import javax.swing.JOptionPane;
import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;

public class poised {
    public static void main (String[]args) throws FileNotFoundException, IOException {

        NewProject[] projects = new NewProject[5];
        int projNum = 0;//Number of projects

        Architect[] architects = new Architect[5];
        int architectNum = 0;//Number of architects

        Contractor[] contractors = new Contractor[5];
        int contractorNum = 0;//Number of contractors

//Get the time in which the program is being accessed
        String timestamp = new SimpleDateFormat("yyyMMdd").format(Calendar.getInstance().getTime());
        char option = JOptionPane.showInputDialog("MAIN MENU,Please choose an option from below: \n A) Add a project \n" +
                "B) Add an Architect \n C) Add a Contractor\n D) Finalize a project \n E) Edit \n X) Exit").toLowerCase().charAt(0);

        //Create a loop for the menu to keep showing as long as the user has not exited
        while (option != 'x') {
//Option for adding new projects
            if (option == 'a') {
                if (projNum > 4) {
                    System.out.println("You cannot add any more projects.Please complete the projects and try again");
                } else {
                    NewProject plink = new NewProject();
                    projects[projNum] = new NewProject(plink.projNum, plink.projName, plink.building, plink.clientAdress, plink.erfnum, plink.totalCost, plink.paid, plink.date, plink.clientName, plink.clientNum, plink.clientEmail, plink.clientAdress);
                    System.out.println("Your project has been added and your project number is" + projNum);
                    projNum++;
                }
            }
//Option for adding new architects
            if (option == 'b') {
                if (architectNum > 4) {
                    System.out.println("You cannot add any more Architects");
                } else {
                    Architect alink = new Architect();
                    architects[architectNum] = new Architect(alink.name, alink.num, alink.email, alink.address);
                    architectNum++;
                }
            }
            //Option for adding new contractors
            if (option == 'c') {
                if (contractorNum > 4) {
                    System.out.println("You cannot add any more Contractors");
                } else {
                    Contractor clink = new Contractor();
                    contractors[contractorNum] = new Contractor(clink.name, clink.num, clink.email, clink.address);
                    contractorNum++;
                }
            }
            //Option for finalising a project
            if (option == 'd') {
                PrintWriter writer = new PrintWriter("Finished Projects.txt");

                int projnum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the project you would like to finalize:"));
                if (projects[projnum].getTotalCost() > 0.00) {

                    System.out.println("You have an outstanding balance of R" + projects[projnum].getTotalCost());
                    writer.write("You have an outstanding balance of R" + projects[projnum].getTotalCost() + "\n");
                    writer.write("Name: " + projects[projnum].clientName + "\n");
                    writer.write("Email: " + projects[projnum].clientEmail + "\n");
                    writer.write("Phone Number: " + projects[projnum].clientNum + "\n");
                    writer.write("Address: " + projects[projnum].clientAdress + "\n");
                    writer.write("Project Number: " + projects[projnum].projNum + "\n");
                    writer.write("Project Name: " + projects[projnum].projName + "\n");
                    writer.write("Building Type: " + projects[projnum].building + "\n");
                    writer.write(" ERF Number: " + projects[projnum].erfnum + "\n");
                    writer.write("Total Cost: " + projects[projnum].totalCost + "\n");
                    writer.write("Deadline: " + projects[projnum].date + "\n");
                    writer.write(timestamp); // YYYYMMDD format
                    System.out.println(" ");
                    writer.close();

                    try(PrintWriter out = new PrintWriter("Finished Projects.txt"))
                    {
                        System.out.println("File not found");
                    }
                        catch(Exception FileNotFoundException) {
                            FileNotFoundException.printStackTrace();
                        }
                }
                else {
                    writer.write("You have an outstanding balance of R" + projects[projnum].getTotalCost() + "\n");
                    writer.write("Name: " + projects[projnum].clientName + "\n");
                    writer.write("Email: " + projects[projnum].clientEmail + "\n");
                    writer.write("Phone Number: " + projects[projnum].clientNum + "\n");
                    writer.write("Address: " + projects[projnum].clientAdress + "\n");
                    writer.write("Project Number: " + projects[projnum].projNum + "\n");
                    writer.write("Project Name: " + projects[projnum].projName + "\n");
                    writer.write("Building Type: " + projects[projnum].building + "\n");
                    writer.write(" ERF Number: " + projects[projnum].erfnum + "\n");
                    writer.write("Total Cost: " + projects[projnum].totalCost + "\n");
                    writer.write("Deadline: " + projects[projnum].date + "\n");
                    writer.write(timestamp); // YYYYMMDD format
                    System.out.println(" ");
                    writer.close();

                    try(PrintWriter out = new PrintWriter("Finished Projects.txt"))
                    {
                        System.out.println("File not found");
                    }
                    catch(Exception FileNotFoundException) {
                        FileNotFoundException.printStackTrace();
                    }
                }
            }
//Option for editing a project
            if (option == 'e') {
                char option2 = JOptionPane.showInputDialog("What would you like to edit?" + "\nA) Project Due Date" + "\nB) Total cost of the project" + "\nC) Contractors information" + "\nE) Exit").toLowerCase().charAt(0);

                while (option2 != 'e') {
                    int projnum2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the project you want to edit"));
                    if (option2 == 'a') {
                        if (projects[projnum2].date.isEmpty()) {
                            System.out.println("This project does not exist");
                        }
                        else {
                            String change = JOptionPane.showInputDialog("Please enter the new due date YYYY/MM/DD");
                            System.out.println("The project due date has been changed");
                            System.out.println("Old due date: " + projects[projnum2].date);
                            projects[projnum2].date = change;
                            System.out.println("New Due Date: " + projects[projnum2].date);
                        }
                    }
                    //Option for changing the total cost of the project
                    if (option2 == 'b') {
                        double change = Double.parseDouble(JOptionPane.showInputDialog("Enter the new amount"));

                        System.out.println("The total cost of the project has been changed");
                        System.out.println("Old cost R " + projects[projnum2].totalCost);
                        projects[projnum2].totalCost = change;
                        System.out.println("New cost R " + projects[projnum2].totalCost);
                    }
                    //Option for changing a contractor
                    if (option2 == 'c') {
                        contractors[projnum2].name = JOptionPane.showInputDialog("Enter new Contractor name");
                        contractors[projnum2].num = Integer.parseInt(JOptionPane.showInputDialog("Enter new Contractor phone number"));
                        contractors[projnum2].email = JOptionPane.showInputDialog("Enter new Contractor email address");
                        contractors[projnum2].address = JOptionPane.showInputDialog("Enter new Contractor physical address");
                    }
                }
            }
            //Main Menu
            option = JOptionPane.showInputDialog("MAIN MENU:" + "\nA) Add project" + "\nB) Add Architect" + "\nC) Add Contractor" + "\nD) Finalize a project" + "\nE) Edit" + "\nX) Exit").toLowerCase().charAt(0);
        }
    }
    }

