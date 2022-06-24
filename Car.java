import java.awt.*;
import java.util.Date;

final class Car {
    private final Model model;
    private final int year;
    private final int personCapacity;
    private final Date yearOfProduction;
    private final int km;
    private final Color color;

    public Car(Model model, int year, int personCapacity, Date yearOfProduction, int km, Color color) {
        this.model = model;
        this.year = year;
        this.personCapacity = personCapacity;
        this.yearOfProduction = yearOfProduction;
        this.km = km;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPersonCapacity() {
        return personCapacity;
    }

    public Date getYearOfProduction() {
        return yearOfProduction;
    }

    public int getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }
}