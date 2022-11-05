package objects;

import java.util.Arrays;

public class Dealership {
    // private
    private Car[] cars;

    //constructor
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    //setters
    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }

    //getters
    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    //actions
    public void sell(int index) {
        System.out.println("Please drive your car to the nearest exit");
        this.cars[index].drive();
        this.cars[index] = null;

    }
    public int search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget) {
                System.out.println("\n We have a " + this.cars[i].getMake() + " it's at spot " + i);
                System.out.print("\nAre you interested?");
                return i;
            }
        }
        System.out.println("\n Sorry, we don't have anything that matches your current criteria");
        System.out.println("\n Please take a look at our collection");
        return 404;
    }
    public String toString() {
        String temp = " ";
        for (int i = 0; i < cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "Empty\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }
}
