package com.pm.authservice.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

public class JwtUtil {
    private final Key secretKey;

    public JwtUtil(@Value('${jwt.secret}') String secret) {
        byte[] KeyBytes = Base64.getDecoder().decode(secret.getBytes(StandardCharsets.UTF_8));
        this.secretKey = Keys.hmacShaKeyFor(KeyBytes);
    }

    public String generateToken(String email, String role) {
        // Implementation for generating JWT token with 10 hrs validity
        return Jwts.builder()
                .subject(email)
                .claim("role", role)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1000*60*60*10))
                .signWith(secretKey)
                .compact();
    }
}
