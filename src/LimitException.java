public class LimitException extends Throwable {
    private String message;
    private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;

    }
}
