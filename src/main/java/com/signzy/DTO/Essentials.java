package com.signzy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Essentials {
    private String number;
    private String uid;
    private String gstin;
    private String emailId;
}
