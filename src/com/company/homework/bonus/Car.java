package com.company.homework.bonus;

public class Car {

    private final double fuelEfficiency;
    private double fuelInTank;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = (fuelEfficiency < 0) ? 0 : fuelEfficiency;
        fuelInTank = 0;
    }

    public void drive(double distance) {
        if (distance < 0 || fuelEfficiency < 0) {
            System.out.println("Distance and Efficiency must be bigger than 0");
            return;
        }
        System.out.println("The car drove " + distance + " km.");
        fuelInTank -= distance / fuelEfficiency;
    }

    public double getFuelLevel() {
        if (fuelInTank < 0) {
            return 0;
        }
        return Math.round(fuelInTank) * 1.0;
    }

    public void addFuel(double additionalFuel) {
        if (additionalFuel <= 0) {
            System.out.println("Amount of added fuel must be bigger than 0");
            return;
        }
        fuelInTank += additionalFuel;
        System.out.println(additionalFuel + " litres are added in the tank.");
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
}
