package org.example;

public class SmartDoor {
    private boolean isLocked;

    public void isLocked() {
        System.out.println("Is door locked? " + isLocked);
    }

    public void lockDoor() {
        System.out.println("Locking the door...");
        isLocked = true;
        System.out.println("Is door locked? " + isLocked);
    }

    public void unlockDoor() {
        System.out.println("Unlocking the door...");
        isLocked = false;
        System.out.println("Is door locked? " + isLocked);
    }
}
