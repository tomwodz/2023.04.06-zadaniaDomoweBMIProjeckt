package pl.comarch.it.camp.tomwodz.bmiproject.ID;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ID {
        static Random random = new Random();
        static int nextID = 0;
    public static String advanceId(String n) {
        String actualValue = n.substring(0, 2);
        LocalDate myDateObj = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd");
        String strDate = myDateObj.format(myFormatObj);
        int i = random.nextInt(0, 1000);
        String uniqueID = actualValue.toUpperCase() + strDate  + String.valueOf(i);
        return uniqueID;
    }

    public static int nextID(){
        ++nextID;
        return nextID;
    }
}
