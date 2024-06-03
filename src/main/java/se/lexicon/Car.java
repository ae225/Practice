package se.lexicon;

public class Car {
    //Variables
    String brand;
    String regNumber;
    int maxSpeed;
    String ownerName;
    String color;

    public static void main(String[] args) {
        //Object
        Car myCar = new Car();

        //Values to the object's attributes
        myCar.brand = "Volvo";
        myCar.regNumber = "ABC123";
        myCar.maxSpeed = 180;
        myCar.ownerName = "Edvard Long";
        myCar.color = "Yellow";

        //Print out the values
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Registration Number: " + myCar.regNumber);
        System.out.println("Max Speed: " + myCar.maxSpeed + " km/h");
        System.out.println("Owner Name: " + myCar.ownerName);
        System.out.println("Color: " + myCar.color);

    }
}
