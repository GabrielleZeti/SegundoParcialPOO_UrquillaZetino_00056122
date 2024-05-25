public class PaymentProviderFactory {
    public static PaymentProvider createProvider(String providerName, String username, String password) {
        switch (providerName.toLowerCase()) {
            case "paypal":
                return new PayPalProvider(username, password);
            case "stripe":
                return new StripeProvider(username);
            case "square":
                return new SquareProvider(username);
            case "authorize.net":
                return new AuthorizeNetProvider(username);
            case "alipay":
                return new AlipayProvider(username);
            default:
                throw new IllegalArgumentException("Proveedor desconocido: " + providerName);
        }
    }
}