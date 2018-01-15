package ZadanieKwiaciarnia;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kasia on 2017-09-05.
 */
public class PriceList {
    private static PriceList instance;
    static Map<String, Double> map = new HashMap<String, Double>();

    private PriceList(){}

    public static PriceList getInstance() {
        if (instance == null) {
            instance = new PriceList();
        }
        return instance;
    }

    public void put(String nazwa, double cena) {
        map.put(nazwa, cena);
    }

    public static double getPrice(String nazwa) {
            return (map.containsKey(nazwa))? map.get(nazwa): -1;
    }


}

