package com.company;

import com.company.homework.Invoice;
import com.company.homework.bonus.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var car = new Car(20);
        System.out.println("Correct car with efficiency " +car.getFuelEfficiency() + "km/litre");
        car.addFuel(100);
        System.out.println("Current fuel level " + car.getFuelLevel());
        car.drive(200);
        System.out.println("Current fuel level " + car.getFuelLevel());

        System.out.println();

        var invalidValueCar = new Car(0);
        System.out.println("Car with invalid data with efficiency " +invalidValueCar.getFuelEfficiency() + "km/litre");
        invalidValueCar.addFuel(-10);
        System.out.println("Current fuel level " + invalidValueCar.getFuelLevel());
        invalidValueCar.drive(-10);

//        Invoice testInvoice = new Invoice("1", "someTestItem", 2, 5);
//        Invoice testInvoice2 = new Invoice("2", "someTestItem2", -2, 5);
//        Invoice testInvoice3 = new Invoice("3", "someTestItem3", 4, -5);
//
//        List<Invoice> invoices = new ArrayList<>();
//        invoices.add(testInvoice);
//        invoices.add(testInvoice2);
//        invoices.add(testInvoice3);
//
//        for (var invoice : invoices
//        ) {
//            System.out.println("Invoice N. " + invoice.getNumber() + " for the items " + invoice.getDescription() +
//                    " in amount " + invoice.getSoldItems() + " with price per item " + invoice.getPrice() + " with total amount to pay "
//            + invoice.getInvoiceAmount(invoice.getSoldItems(),invoice.getPrice()));
//        }
 }
}


