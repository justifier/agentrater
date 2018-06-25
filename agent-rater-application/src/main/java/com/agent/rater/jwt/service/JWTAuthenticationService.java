package com.agent.rater.jwt.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.h2.util.DateTimeUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTAuthenticationService {

    private static final long EXPIRATION_TIME = 1200000; // 20mins

    private static final long REFRESH_LIMIT = 600000; // 10mins

    private static final String SECRET = "agentRaterSecret";

    private static final String HEADER_STRING = "Authorization";

    public static void createAuthenticationTokenForUser(HttpServletResponse response, String username) {
        //creating JWT token for user
        String JWT = Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET).compact();

        response.addHeader(HEADER_STRING, JWT);
    }

    public static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(HEADER_STRING);
        if (token != null) {
            String user = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getSubject();
            return user != null ? new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList()) : null;
        }
        return null;
    }

    public static void checkTokenExpiryAndIssueNew(HttpServletRequest request, HttpServletResponse response, String username) {
        String token = request.getHeader(HEADER_STRING);
        Date currentDate = new Date();
        Date tokenExpiry = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getExpiration();
        if (tokenExpiry.getTime() - currentDate.getTime() < REFRESH_LIMIT) {
            createAuthenticationTokenForUser(response, username);
        }
    }

}
