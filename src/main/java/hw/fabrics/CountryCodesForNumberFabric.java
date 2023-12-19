package hw.fabrics;

import hw.utils.Pair;

import java.util.HashMap;
import java.util.Map;

public class CountryCodesForNumberFabric {
    private static Map<String, Pair<String, Integer>> codes = new HashMap<>(Map.of(
            "+7", new Pair<>("Russia", 10),
            "+212", new Pair<>("USA", 7)
    ));

    public static Pair<String, Integer> checkCodeAndGetPairOfCountryAndDigitsAmount(String code) {
        return codes.getOrDefault(code, null);
    }

}
