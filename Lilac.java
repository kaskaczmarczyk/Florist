package ZadanieKwiaciarnia;

/**
 * Created by Kasia on 2017-09-07.
 */
public class Lilac extends Flower {
    String nazwa = "bez";
    String kolor = "fioletowy";

    public Lilac (int liczbaKwiatow){
        super(liczbaKwiatow);
    }

    @Override
    public String getNazwa() {
        return this.nazwa;
    }

    @Override
    public String getKolor() {
        return this.kolor;
    }
}
