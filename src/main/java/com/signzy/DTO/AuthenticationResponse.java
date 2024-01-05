package com.signzy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String id;
    private Long ttl;
    private String created;
    private String userId;
}
