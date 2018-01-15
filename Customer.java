package ZadanieKwiaciarnia;
import java.util.ArrayList;
import static jdk.nashorn.internal.runtime.JSType.toDouble;

public class Customer {
    private String imie = "";
    private static double budzet;
    private ShoppingCart wozek;
    private Box pudelko;

    public Customer() {}

    public Customer(String imieKlienta, int budzetKlienta) {
        this.imie = imieKlienta;
        this.budzet = budzetKlienta;
        wozek = new ShoppingCart(this);
        pudelko = new Box(this);
    }


    public void get(Flower flower) {
        wozek.add(flower);
    }

    public ShoppingCart getShoppingCart() {
        return this.wozek;
    }

    public Box getBox() {
        return this.pudelko;
    }

    public void pay() {
        budzet -= wozek.getValue();
    }

    public void pack(Box pudelko) {
        for (Flower flower : wozek) {
            pudelko.add(flower);
        }
        wozek.clear();
    }

    public double getCash() {
        return budzet;
    }

    @Override
    public String toString() {
        return imie;
    }
}

