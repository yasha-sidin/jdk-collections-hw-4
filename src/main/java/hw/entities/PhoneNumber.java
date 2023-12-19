package hw.entities;

import hw.exceptions.PhoneBodyException;
import hw.exceptions.PhoneCodeException;
import hw.exceptions.PhoneNumberException;
import hw.fabrics.CountryCodesForNumberFabric;
import hw.utils.Pair;
import lombok.AccessLevel;
import lombok.Getter;

import java.util.regex.Pattern;

@Getter
public class PhoneNumber {
    private final String code;
    private final String country;
    @Getter(AccessLevel.NONE)
    private final int DIGIT_AMOUNT;
    private final String body;

    public PhoneNumber(String code, String body) throws PhoneNumberException {
        Pair<String, Integer> pair = CountryCodesForNumberFabric.checkCodeAndGetPairOfCountryAndDigitsAmount(code);
        if (pair == null)
            throw new PhoneCodeException("Code is wrong");
        this.code = code;
        this.country = pair.left();
        this.DIGIT_AMOUNT = pair.right();
        String regex = "\\d{" + DIGIT_AMOUNT + "}";
        if (!Pattern.matches(regex, body))
            throw new PhoneBodyException("Body with this code must consist from " + DIGIT_AMOUNT + " digits");
        this.body = body;
     }

    @Override
    public String toString() {
        return code + body;
    }
}
