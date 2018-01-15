package ZadanieKwiaciarnia;

public class FloristTest {

    static int valueOf(Box pudelko, String kolor) {
        int sum = 0;

        for (Flower flower : pudelko) {
            if (flower.getKolor().equalsIgnoreCase(kolor)) {
                sum += (int) (flower.getPrice());
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        PriceList pl = PriceList.getInstance();

        pl.put("róża", 10.0);
        pl.put("bez", 12.0);
        pl.put("piwonia", 8.0);
        Customer janek = new Customer ("Janek", 200);
        janek.get(new Rose(5));
        janek.get(new Peony(5));
        janek.get(new Fressia(3));
        janek.get(new Lilac(3));
        ShoppingCart wozekJanka = janek.getShoppingCart();
        System.out.println("Przed płaceniem " + wozekJanka);

        janek.pay();
        System.out.println("Po zapłaceniu: " + janek.getShoppingCart());
        System.out.println("Jankowi zostało: " + janek.getCash() + " zł");
        Box pudelkoJanka = new Box(janek);
        janek.pack(pudelkoJanka);
        System.out.println("Po zapakowaniu do pudełka: " + janek.getShoppingCart());
        System.out.println(pudelkoJanka);
        System.out.println("Czerwone kwiaty w pudełku Janka kosztowały: " + valueOf(pudelkoJanka, "czerwony"));

        Customer stefan = new Customer("Stefan", 60);
        stefan.get(new Lilac(3));
        stefan.get(new Rose(5));
        System.out.println(stefan.getShoppingCart());
        stefan.pay();
        Box pudelkoStefana = new Box(stefan);
        stefan.pack(pudelkoStefana);
        System.out.println(pudelkoStefana);
        System.out.println("Stefanowi zostało: " + stefan.getCash() + " zł");
 }
}
