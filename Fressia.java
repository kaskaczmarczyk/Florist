package ZadanieKwiaciarnia;

public class Fressia extends Flower{
    String nazwa = "frezja";
    String kolor = "biały";

    public Fressia (int liczbaKwiatow){
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
