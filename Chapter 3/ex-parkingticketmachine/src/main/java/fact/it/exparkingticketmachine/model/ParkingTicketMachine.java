package fact.it.exparkingticketmachine.model;

public class ParkingTicketMachine {
    private int price;
    private int balance;
    private int total;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void receiveMoney(int amount) {
        this.balance += amount;
    }

    public String showTicket() {
        String baseString = "#-# Parking meter #-# Ticket = " + this.price + " euros #-#";
        if (this.balance >= this.price) {
            this.total += this.price;
            this.balance -= this.price;
            if (this.balance > 0) {
                baseString += " (change = " + (this.balance) + " euros)";
            }
        } else {
            baseString = "You still need to insert at least " + (this.price - this.balance) + " euros";
        }
        return baseString;
    }
}
