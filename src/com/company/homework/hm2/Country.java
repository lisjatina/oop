package com.company.homework.hm2;

public class Country implements Measurable{

    private String country;
    private double area;

    public Country(String country, double area) {
        this.country = country;
        this.area = (area < 0) ? 0 :area;
    }

    @Override
    public double getMeasure() {
        return area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
