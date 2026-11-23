//Superclass
class Vehicle {
    String brand="Ford";

    public void msg() {
        System.out.println("method from vehicle class");
    }
}

//Subclass inheriting from Vehicle
class Car extends Vehicle {
    String modelName="Mustang";
}

public class SingleInheritance{
    public static void main(String[]args) {
        Car myCar = new Car();
        myCar.msg(); //Method inherited from Vehicle
        System.out.println(myCar.brand+" "+ myCar.modelName); //Accessing inherited and own fields
       }
}