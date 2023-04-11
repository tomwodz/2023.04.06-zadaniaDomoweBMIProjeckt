package pl.comarch.it.camp.tomwodz.bmiproject.core;
import pl.comarch.it.camp.tomwodz.bmiproject.gui.GUI;
import pl.comarch.it.camp.tomwodz.bmiproject.user.UserOperations;

public class Core {
    GUI gui = new GUI();
    UserOperations userOperations = new UserOperations();
    boolean run = true;
    public void start() {

        do {
            switch (gui.showMenu()) {
                case "1":
                    userOperations.createNewUser();
                    break;
                case "2":
                    userOperations.remindBmi();
                    break;
                case "3":
                    run = gui.showExit();
                    break;
                default:
                    gui.showWrongChoose();
                    break;
            }
        }

        while (run);
    }
}
