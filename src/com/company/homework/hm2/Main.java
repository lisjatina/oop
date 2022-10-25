package com.company.homework.hm2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Measurable[] countries = {new Country("Latvia", 64.58),
                new Country("Lithuania", 63.30),
                new Country("Estonia", 45.22)};

        var biggestBalticCountry = (Country) maximum(countries);
        System.out.println("The biggest Baltic country is "
                + biggestBalticCountry.getCountry()+ ". "
                + "The area is " + biggestBalticCountry.getMeasure() + " km2.");
    }

    public static Measurable maximum(Measurable[] objects) {
        return Arrays.stream(objects).max(Comparator.comparing(Measurable::getMeasure)).orElseThrow();
    }
}
