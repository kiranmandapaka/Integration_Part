package com.signzy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignzyRequestMap {
    private String transID;
    private String aadharNumber;
    private String panNumber;
    private String email;
    private String name;
    private String mobileNumber;
}
