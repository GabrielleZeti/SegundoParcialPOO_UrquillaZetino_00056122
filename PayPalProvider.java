public class PayPalProvider implements PaymentProvider {
    private String username;
    private String password;

    public PayPalProvider(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getToken() {
        return username + ":" + password;
    }
}