package EcommerceShopping.authentication;

public class BasicAuthAuthenticator implements Authenticator {

    public static final String VALID_USER_NAME = "basicUser";
    public static final String VALID_PASSWORD = "validPassword";

    @Override
    public boolean authenticate(Credentials credentials) {

        if (credentials instanceof BasicAuthCredentials basic) {
            return VALID_USER_NAME.equals(basic.getUsername()) && VALID_PASSWORD.equals(basic.getPassword());
        }
        return false;
    }

    public static void main(String[] args) {

        Authenticator authenticator = new BasicAuthAuthenticator();
        Credentials credentials = new OAuthCredentials("someToken");
        boolean result = authenticator.authenticate(credentials);

    }

}