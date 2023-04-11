package pl.comarch.it.camp.tomwodz.bmiproject.bmi;

public class Bmi {

    public double bmiCalculate(double weight, double height){
        double bmiCalculate = weight / ((height /100 )  * (height / 100));
        return bmiCalculate;
    }

    String descriptonBmi;
    public String descriptonBmi(double bmi) {
        if (bmi < 16) {
            descriptonBmi = "Wgłodzenie";
        } else if (bmi >= 16 && bmi < 16.99) {
            descriptonBmi = "Wychudzenie";
        } else if (bmi >= 16.99 && bmi < 18.49) {
            descriptonBmi = "Niedowaga";
        } else if (bmi >= 18.49 && bmi < 24.99) {
            descriptonBmi = "Waga prawidlowa";
        } else if (bmi >= 24.99 && bmi < 29.99) {
            descriptonBmi = "Nadwaga";
        } else if (bmi >= 29.99 && bmi < 34.99) {
            descriptonBmi = "I stopien otylosci";
        } else if (bmi >= 34.99 && bmi < 39.99) {
            descriptonBmi = "II stopien otylosci";
        } else {
            descriptonBmi = "III stopien otylosci";
        }
        return descriptonBmi;
    }


}
