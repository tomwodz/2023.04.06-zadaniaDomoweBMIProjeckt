package pl.comarch.it.camp.tomwodz.bmiproject.gui;
import pl.comarch.it.camp.tomwodz.bmiproject.user.User;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GUI {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat bmi = new DecimalFormat("##.##");

    public String showMenu(){
        System.out.println("Menu: ");
        System.out.println("1. Oblicz BMI" );
        System.out.println("2. Przypomnij BMI: ");
        System.out.println("3. Exit");
        System.out.println("---------");
        System.out.println("Select options: ");
        return scanner.next();
    }

    public boolean showExit(){
        System.out.println("Thank you for using this program. See you next time!");
        return false;
    }

    public void showWrongChoose(){
        System.out.println("Wrong choose! Please try again.");
    }

    public void showListUsers(User[] users){
        for (User user : users)
        {
            System.out.println(new StringBuilder()
                    .append("ID: ")
                    .append(user.getID())
                    .append(" | nextID: ")
                    .append(user.getNextID())
                    .append(" | Name: ")
                    .append(user.getName())
                    .append(" | Height: ")
                    .append(user.getHeight())
                    .append(" | Weight: ")
                    .append(user.getWeight())
                    .append(" | BMI: ")
                    .append(bmi.format(user.getBMI()))
                    .append(" | Description: ")
                    .append(user.getDescriptionBmi())
                    .append(" | empty: ").
                    append(user.isEmpty())
                    .toString());
        }
    }
    public  boolean showIndividualListUser(User[] users, String uniqueId) {
        for (User user : users) {
            if (uniqueId.equals(user.getID())) {
                System.out.println(new StringBuilder()
                        .append("ID: ")
                        .append(user.getID())
                        .append(" | nextID: ")
                        .append(user.getNextID())
                        .append(" | Name: ")
                        .append(user.getName())
                        .append(" | Height: ")
                        .append(user.getHeight())
                        .append(" | Weight: ")
                        .append(user.getWeight())
                        .append(" | BMI: ")
                        .append(bmi.format(user.getBMI()))
                        .append(" | Description: ")
                        .append(user.getDescriptionBmi())
                        .toString());
                return true;
            }
        }
        return false;
    }

    public void showUserExistID(boolean aExist){
        if(aExist == true){
            System.out.println("Success!");}
            else {
            System.out.println("Id isn't exist. Please try again!");}
    }

    public String showMenuReturnBmi(){
        System.out.println("Please write your unique ID:");
        return scanner.next();
    }
    public String giveName(){
        System.out.println("Please give your name:");
        return scanner.next();
    }

    public double giveHeight(String name) {
        System.out.println(name + " please give your height [cm]:");
        return scanner.nextDouble();
    }
    public double giveWeight(String name) {
        System.out.println(name + " please give your weight [cm]:");
        return scanner.nextDouble();
    }

}
