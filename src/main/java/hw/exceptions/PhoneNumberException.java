package hw.exceptions;

public class PhoneNumberException extends Exception {
    public PhoneNumberException(String msg) {
        super(msg);
    }

    public PhoneNumberException() {
        super();
    }
}
