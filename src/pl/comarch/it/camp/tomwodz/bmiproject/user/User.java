package pl.comarch.it.camp.tomwodz.bmiproject.user;

public class User {
    int nextID; //nextId - wprowadzony do automatycznego czyszczenia tablicy z najstarszego User.
    private String ID;
    private String name;
    private double weight;
    private double height;
    private double BMI;
    private String descriptionBmi;
    private boolean empty;



    public User(String ID, String name, double height, double weight, double BMI, String descriptionBmi, boolean empty, int nextID) {
        this.ID = ID;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.BMI = BMI;
        this.descriptionBmi = descriptionBmi;
        this.empty = empty;
        this.nextID = nextID;
    }


    public User() {
    }

    public String getDescriptionBmi() {
        return descriptionBmi;
    }

    public void setDescriptionBmi(String descriptionBmi) {
        this.descriptionBmi = descriptionBmi;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double getBMI() {
        return BMI;
    }

    public double setBMI(double BMI) {
        this.BMI = BMI;
        return BMI;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public int getNextID() {
        return nextID;
    }

    public void setNextID(int nextID) {
        this.nextID = nextID;
    }
}
