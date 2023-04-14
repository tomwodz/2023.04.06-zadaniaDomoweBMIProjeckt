package pl.comarch.it.camp.tomwodz.bmiproject.user;

import pl.comarch.it.camp.tomwodz.bmiproject.ID.ID;
import pl.comarch.it.camp.tomwodz.bmiproject.bmi.Bmi;
import pl.comarch.it.camp.tomwodz.bmiproject.db.UserRepository;
import pl.comarch.it.camp.tomwodz.bmiproject.gui.GUI;
import java.util.Scanner;

public class UserOperations {
    GUI gui = new GUI();
    Bmi bmi = new Bmi();
    UserRepository users = new UserRepository();
    String name, descriptionBmi, uniqueID;
    double height, weight, bmiRes;
    boolean run = true;
    int nextID;

    public void createNewUser(){

        // Scanner scanner = new Scanner(System.in);
        //name = "Tomek" ; height =180; weight = 90;
        name = gui.giveName();
        uniqueID = ID.advanceId(name);
        nextID = ID.nextID();
        height = gui.giveHeight(name);
        weight = gui.giveWeight(name);
        bmiRes = bmi.bmiCalculate(weight, height);
        descriptionBmi = bmi.descriptonBmi(bmiRes);
        users.setUsers(uniqueID, name, height, weight, bmiRes, descriptionBmi, false, nextID);
        gui.showUserExistID(gui.showIndividualListUser(users.getUsers(), uniqueID));

        System.out.println("---------------------------------------------------------------");

        // gui.showListUsers(users.getUsers());
    }

    public void remindBmi(){

       // gui.showListUsers(users.getUsers());

        uniqueID = gui.showMenuReturnBmi();
        gui.showUserExistID(gui.showIndividualListUser(users.getUsers(), uniqueID));
    }

}
