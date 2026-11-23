//Superclass (Level1)
class Vehicle {
    String brand="Ford";
    public void msg(){
        System.out.println("method from vehicle class");
    }
}
//Subclass of vehicle (Level 2)
class Car extends Vehicle{
    String model = "Mustang";
    public void drive(){
        System.out.println("This car is driving");
    }
}
//Subclass of Car (Level 3)
class SportsCar extends Car{
    int maxSpeed=300;

}
public class MultilevelInheritance {
    public static void main(String[]args){
        SportsCar mySportsCar= new SportsCar();

        //Accessing members from all levels
        mySportsCar.msg();
        mySportsCar.drive();
        System.out.println(mySportsCar.brand+" "+mySportsCar.model+" "+ mySportsCar.maxSpeed);
    }
}