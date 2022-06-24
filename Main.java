import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Model.AUDI, 2010, 5,new Date(2009,12,10),250000, Color.white);
        System.out.println(car1.getModel());
        System.out.println(car1.getYearOfProduction());
    }

}
