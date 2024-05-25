public class Main {
    public static void main(String[] args) {
        PaymentProviderBuilder builder = new PaymentProviderBuilder();
        PaymentProviderDirector director = new PaymentProviderDirector(builder);

        PaymentProvider paypalProvider = director.construct("paypal", "user@example.com", "password123");
        System.out.println("PayPal Token: " + paypalProvider.getToken());

        PaymentProvider stripeProvider = director.construct("stripe", "user@example.com", null);
        System.out.println("Stripe Token: " + stripeProvider.getToken());

    }
}