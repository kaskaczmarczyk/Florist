package ZadanieKwiaciarnia;

public class Rose extends Flower{
    String nazwa = "róża";
    String kolor = "czerwony";

    public Rose (int liczbaKwiatow){
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
