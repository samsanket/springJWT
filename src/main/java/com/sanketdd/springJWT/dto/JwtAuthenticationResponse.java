package com.sanketdd.springJWT.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthenticationResponse {
  String token;


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}