package hw.exceptions;

public class PhoneCodeException extends PhoneNumberException {
    public PhoneCodeException(String msg) {
        super(msg);
    }

    public PhoneCodeException() {
        super();
    }
}
