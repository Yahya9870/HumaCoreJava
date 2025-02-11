public class Encapsulation {
    // What is Encapsulation also known as wrapping?

    // Ans: It is a fundamental (basic) concept of Object-Oriented Programming (OOP).

    // Basically it is bundling of data members (variables) and methods in java == (functions in cpp) that
    // operate on the single unit for example class.
    // In simple words binding your variables and functions in a class.

    // The reason behind this bundling data members and functions is data protection and privacy from the outside world.


    // For example, you have an iPhone, MacBook, Airpods, Apple Watch, iPad, iPod, iMac.

    // Scenario A: you have put above things on roads, parks here and there. (Without Encapsulation)

    // Scenario B: you have put inside the house and door is locked. (Encapsulation)

    // Question: In which of the aforementioned scenarios your belongings will be safer?


    // We are following Scenario A and everything is privately accessible to the owner.

    // Suppose Macbook got some technical issues that need a qualified Apple support in order to get that issue resolved.

    // For a fixed period of time under your supervision you will be giving controlled and limited (whatever required in order to fix it), access to that official guy.

    public static void main(String[] args) {
        Car highlander = new Car();
         // highlander.color="Black"; // error bcoz color has private access in Car class.
                    // suppose we make color public then it will violate encapsulation principles.

        // Now we have created desired setter and getter methods, lets try to edit and access private field of class Car.
        highlander.setColor("Black");
        highlander.setBrand("Toyota");
        highlander.setSpeed(180);
        highlander.setPrice(50000);
        System.out.println("---------------Highlander Hybrid Details---------------------------\n");

        System.out.println("Highlander Color: " + highlander.getColor());
        System.out.println("Highlander Brand: " + highlander.getBrand());
        System.out.println("Highlander Speed: " + highlander.getSpeed());
        System.out.println("Highlander Price: " + highlander.getPrice());

    }

}

class Car{

    private String color;
    private int speed;
    private int price;
    private String brand;

    // setter (change or edit in the value) and getter (just shows the value) methods/functions.
    // setter it does not have return type void.
    // setter obviously it will have the parameter.

    // getter (read-only mode eg PDF docs we have)
    // getter obviously no.



    //setter methods/funcs.

     public void setColor(String color) {
         this.color = color;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }

     // getter methods

     public String getColor() {
        // System.out.println("The color of the car is:  "+color); // with void return type
        return color;
     }
     public int getSpeed() {
         return speed;
     }
     public int getPrice() {
         return price;
     }

     public String getBrand() {
         return brand;
     }








}
