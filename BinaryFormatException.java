/*
 * Define a custom exception called BinaryFormatException.
 */
public class BinaryFormatException extends NumberFormatException {

    public BinaryFormatException(String binaryString) {
        super("Invalid binary string: " + binaryString);
    }
}