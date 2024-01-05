package com.signzy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdentitiesRequest {
    private String type;
    private String callbackUrl;
    private String email;
    private String[] images;
}
