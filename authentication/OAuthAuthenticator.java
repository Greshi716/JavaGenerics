package EcommerceShopping.authentication;


public class OAuthAuthenticator implements Authenticator {

    public static final String VALID_OAUTH_TOKEN = "validOAuthToken";

    @Override
    public boolean authenticate(Credentials credentials) {

        if (credentials instanceof OAuthCredentials oauth) {
            return VALID_OAUTH_TOKEN.equals(oauth.getToken());
        }

        return false;
    }
}