package org.example;


public class Main {
    public static void main(String[] args) {

        //  1. Designing Methods
        System.out.println("--- 1. Designing Methods ---");
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine();
        System.out.println("-----------");


        //  2. Passing Parameters: Primitives vs. Objects
        System.out.println("\n--- 2. Passing Parameters: Primitives vs. Objects ---");
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        ParameterPassing.modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);

        //  student object -- mini challenge
        Student student = new Student();
        System.out.println("\nBefore method call (student name): " + student.name);
        changeStudentName(student, "Lukas");
        System.out.println("After method call (student name): " + student.name);
        System.out.println("-----------");


        //  3. Using Varargs
        System.out.println("\n--- 3. Using Varargs ---");
        VarargsExample.printMessages("Hello", "World");
        VarargsExample.printMessages("Testing", "Varargs", "Here");
        VarargsExample.printMessages();

        //  mini challenge
        VarargsExample.findLargest(10, 5, 25, 15);
        VarargsExample.findLargest(-5, -1, -10);
        VarargsExample.findLargest();
        System.out.println("\n-----------");


        //  4. Access Specifiers
        System.out.println("\n--- 4. Access Specifiers ---");
        System.out.println(" ");
        SmartDoor smartDoor = new SmartDoor();
        smartDoor.isLocked();
        smartDoor.lockDoor();
        smartDoor.unlockDoor();
        System.out.println("\n-----------");


        //  5. Static Methods and Variables
        System.out.println("\n--- 5. Static Methods and Variables ---");
        System.out.println("App Name: " + Utility.getAppName());

        // The following line would cause a compile-time error
        // System.out.println("Instance ID: " + Utility.getInstanceId());

        Utility utilInstance = new Utility();
        System.out.println("Instance ID: " + utilInstance.getInstanceId());

        // mini challenge
        System.out.printf("\n%.1f degrees C is %.1f degrees F.", 25.0, Converter.celsiusToFahrenheit(25));
        System.out.println("\n-----------");


        //  6. Method Overloading
        System.out.println("\n--- 6. Method Overloading ---");
        Display d = new Display();
        d.show(42);
        d.show("Hello");
        d.show("Goodbye", 3);

        System.out.printf("\n%.1f degrees F is %.1f degrees C.", 77.0, Converter.fahrenheitToCelsius(77));
        System.out.println("\n-----------");


        //  7. Constructors and Constructor Overloading
        System.out.println("\n--- 7. Constructors and Constructor Overloading ---");
        Pizza pizza1 = new Pizza();
        pizza1.display();

        Pizza pizza2 = new Pizza("Pepperoni");
        pizza2.display();

        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        pizza3.display();

        System.out.println(" ");

        Computer c1 = new Computer();
        Computer c2 = new Computer("Dell");
        Computer c3 = new Computer("Apple", 16);

        c1.printDetails(1);
        c2.printDetails(2);
        c3.printDetails(3);


        //  8. Encapsulation
        System.out.println("\n--- 8. Encapsulation ---");
        Thermostat stat = new Thermostat(22.5);
        System.out.println("Initial temp: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(25.0); // Set a valid temp
        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());


    }

    //  method to change student name in part 2. Passing Parameters: Primitives vs. Objects
    public static void changeStudentName(Student student, String newName) {
        student.name = newName;
    }
}