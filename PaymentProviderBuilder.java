public class PaymentProviderBuilder {
    private String providerName;
    private String username;
    private String password;

    public PaymentProviderBuilder setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public PaymentProviderBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public PaymentProviderBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public PaymentProvider build() {
        return PaymentProviderFactory.createProvider(providerName, username, password);
    }
}