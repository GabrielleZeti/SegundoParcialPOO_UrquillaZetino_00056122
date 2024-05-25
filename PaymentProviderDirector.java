public class PaymentProviderDirector {
    private PaymentProviderBuilder builder;

    public PaymentProviderDirector(PaymentProviderBuilder builder) {
        this.builder = builder;
    }

    public PaymentProvider construct(String providerName, String username, String password) {
        return builder.setProviderName(providerName)
                .setUsername(username)
                .setPassword(password)
                .build();
    }
}