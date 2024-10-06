package br.com.possoler.api.api_posso_ler.api.interceptors.auth_token.service;

import exceptions.ClientErrorException;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;

@Service
public class AuthTokenService {

    public void validateUser(HttpServletRequest request) {
        var authToken = request.getHeader("X-USER-AUTH");

        if(authToken == null || authToken.isEmpty()) {
            throw new ClientErrorException("Missing or empty X-USER-AUTH header");
        }
    }
}
