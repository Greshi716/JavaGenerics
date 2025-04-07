package EcommerceShopping.authentication;

public interface Authenticator {
    boolean authenticate(final Credentials credentials);
}