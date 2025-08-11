package org.example;

public class Computer {
    String brand;
    int ramInGB;

    public Computer() {
        this("Generic", 8);
    }

    public Computer(String brand) {
        this(brand, 8); //
    }

    public Computer(String brand, int ramInGB) {
        this.brand = brand;
        this.ramInGB = ramInGB;
    }

    public void printDetails(int number) {
        System.out.println("Computer " + number + ": Brand = " + brand + ", RAM = " + ramInGB + "GB");
    }




}
