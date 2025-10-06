package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private double price;
    public static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Toyota", "black", 20000));
        carList.add(new Car("Honda", "red", 30000));
        carList.add(new Car("Ford", "blue", 40000));
        carList.add(new Car("BMW", "white", 50000));
        carList.add(new Car("Audi", "green", 60000));
    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
