package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
@NoArgsConstructor
public class JwtResponse {
    private String jwtToken;
    private String username;
}
