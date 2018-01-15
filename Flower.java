package ZadanieKwiaciarnia;

public class Flower {
    private int liczba;

    public Flower (int liczba) {
        this.liczba = liczba;
    }

    public String getNazwa() {
        return null;
    }

    public String getKolor() {
        return null;
    }

    public double getPrice() {
        return (PriceList.getPrice(getNazwa())*liczba);
    }

    @Override
    public String toString() {
        return (getNazwa() + ", kolor: " + getKolor() + ", ilość: " + liczba + ", cena: "
        + PriceList.getPrice(getNazwa()));
    }
}
