package com.company.homework;

public class Invoice {

    private String number;
    private String description;
    private int soldItems;
    private int price;

    public Invoice(String number, String description, int soldItems, int price) {
        this.number = number;
        this.description = description;
        this.soldItems = soldItems;
        this.price = price;
    }

    public int getInvoiceAmount(int soldItems, int pricePerItem) {
        if (soldItems < 0 || pricePerItem < 0) {
            return 0;
        } else {
            return soldItems * pricePerItem;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(int soldItems) {
        this.soldItems = soldItems;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
