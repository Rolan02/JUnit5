public class UnfundedProvider implements PaymentProvider {

    @Override
    public void payment(int quantity) throws PayException {
        throw  new PayException("No tiene fondos para pagar");
    }
}
