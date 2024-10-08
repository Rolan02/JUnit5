public class PayPalProvider implements  PaymentProvider {

    @Override
    public void payment(int quantity) throws PayException {
        System.out.println("Haciendo el pago de " + quantity + "mediante PayPal");
    }
}
