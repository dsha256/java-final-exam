package ge.edu.btu;

public class Water {
    String customerNumber;
    double amount;

    Water() {
    }

    Water(String customerNumber, double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Water(customerNumber='%s', amount=%f)", this.customerNumber, this.amount);
    }
}
