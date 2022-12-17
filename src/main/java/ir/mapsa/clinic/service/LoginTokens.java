package ir.mapsa.clinic.service;

import lombok.Getter;

public class LoginTokens {

//    @Getter
    private final Token accessToken;
    @Getter
    private final Token refreshToken;

    public Token getAccessToken() {
        return accessToken;
    }

    private LoginTokens(Token accessToken, Token refreshToken
    ) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;

    }



    public static LoginTokens of(String email, String accessSecretKey, Long accessSecretKeyValidityInMinutes, String refreshSecretKey, Long refreshSecretKeyValidityInMinutes) {
        //Token.of(email, 10L , accessSecretKey);
        //Token.of(email, 1440L , refreshSecretKey);

        return new LoginTokens(Token.of(email, Long.valueOf(accessSecretKeyValidityInMinutes), accessSecretKey),
                Token.of(email, Long.valueOf(refreshSecretKeyValidityInMinutes), refreshSecretKey));
    }

    public static LoginTokens of(String email, String accessSecretKey, Long accessSecretKeyValidityInMinutes, String refreshToken) {
        //Token.of(email, 10L , accessSecretKey);
        //Token.of(email, 1440L , refreshSecretKey);

        return new LoginTokens(Token.of(email, Long.valueOf(accessSecretKeyValidityInMinutes), accessSecretKey),
                Token.of( refreshToken));
    }

}
