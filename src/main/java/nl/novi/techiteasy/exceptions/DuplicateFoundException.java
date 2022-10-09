package nl.novi.techiteasy.exceptions;

public class DuplicateFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public DuplicateFoundException() {
        super();
    }
    public DuplicateFoundException(String message) {
        super(message);
    }
}
