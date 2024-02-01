package CLASS;


public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    public void drive(){
        System.out.println("Car is driving");
        currentFuelInLitres--;
    }
    
    public void addFuel(int fuel){
        currentFuelInLitres += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }
}