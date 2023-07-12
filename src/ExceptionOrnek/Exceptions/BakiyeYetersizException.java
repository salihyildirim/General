package ExceptionOrnek.Exceptions;

public class BakiyeYetersizException extends Exception {
    private String message;

    public BakiyeYetersizException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
