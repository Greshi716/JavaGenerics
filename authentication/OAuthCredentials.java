package EcommerceShopping.authentication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class OAuthCredentials extends Credentials {

    private final String token;

}
