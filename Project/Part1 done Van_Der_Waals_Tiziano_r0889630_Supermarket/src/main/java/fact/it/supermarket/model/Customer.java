package fact.it.supermarket.model;

import java.util.ArrayList;
import java.util.Locale;

public class Customer extends Person {

    private int cardNumber;
    private int yearOfBirth;
    private ArrayList<String> shoppingList = new ArrayList<> ();

    public Customer(String firstName, String surName) {
        super(firstName, surName);
        this.cardNumber = -1;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ArrayList<String> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public boolean addToShoppingList(String productName) {
        if (this.getShoppingList().size() < 5) {
            this.getShoppingList().add(productName);
            return true;
        }
        return false;
    }

    public int getNumberOnShoppingList() {
        return this.getShoppingList().size();
    }

    @Override
    public String toString() {
        return "Customer " + super.toString() + " with card number " + this.getCardNumber();
    }
}
// Tiziano Van der Waals r0889630