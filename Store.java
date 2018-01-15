package ZadanieKwiaciarnia;
import java.util.ArrayList;

public class Store extends ArrayList<Flower>{

    private static final long serialVersionUID = 1L;
    Customer customer;

    public Store(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void put(Flower flower) {
        add(flower);
    }

    public void remove(Flower flower) {
        remove((Object)flower);
    }

    public double getValue() {
        double sum = 0;
        double cash = customer.getCash();
        for (Flower flower : new ArrayList<Flower>(this)) {
            if (flower.getPrice() > 0 && flower.getPrice() < cash) {
                sum += flower.getPrice();
                cash -= flower.getPrice();
            }
            else {
                customer.getShoppingCart().remove(flower);
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(((this instanceof ShoppingCart)? " Wózek " : " Pudełko ")
        + " właściciel " + customer + " ");
        if (this.size() > 0) {
            for (Flower flower : this) {
                sb.append("\n" + flower);
            }
        } else {
            sb.append(" -- pusto");
        }
        return sb.toString();
    }
}
