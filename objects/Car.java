package objects;

import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String colour;
    private String[] parts;

    public Car(String make, double price, int year, String colour, String[] parts) {
        this.make = make;
        this.price= price;
        this.year = year;
        this.colour = colour;
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    //copy constructor
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.colour = source.colour;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }
    //getters
    public String getMake() {
        return this.make;
    }
    public double getPrice() {
        return this.price;
    }
    public int getYear() {
        return this.year;
    }

    public String getColour() {
        return this.colour;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    //setters
    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    //actions
    public void drive() {
        int driveEvent = (int) ((Math.random() * 3) + 1);
        switch (driveEvent) {
            case 1:
                System.out.println("You bought a brand new " + this.colour + " " + this.make + " " + this.year);
                break;
            case 2:
                System.out.println("You crashed your " + this.make + " into a bridge");
                break;
            case 3:
                System.out.println("Your " + this.colour + " " + this.make + " " + this.year + " has a flat tire");
                break;
        }
    }
    public String toString() {
        return
                "Make: " + this.make + ".\n"
               + "Price: " + this.price + ".\n"
               + "Year: " + this.year + ".\n"
               + "Colour: " + this.colour + ".\n"
               + "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
