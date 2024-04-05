package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
@NoArgsConstructor
public class JwtRequest {
    private String email;
    private String password;

}
