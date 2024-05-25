public class StripeProvider implements PaymentProvider {
    private String username;

    public StripeProvider(String username) {
        this.username = username;
    }

    @Override
    public String getToken() {
        return username + ":stripe";
    }
}