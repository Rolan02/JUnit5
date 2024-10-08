public interface PaymentProvider {
    public void payment(int quantity) throws PayException;
}
