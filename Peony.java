package ZadanieKwiaciarnia;

/**
 * Created by Kasia on 2017-09-07.
 */
public class Peony extends Flower {
    String nazwa = "piwonia";
    String kolor = "czerwony";

    public Peony (int liczbaKwiatow){
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
