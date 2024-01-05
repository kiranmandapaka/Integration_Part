package com.signzy.DTO.PanAdharLinked;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanAadharRequestDTO {
    private String transID;
    private String panNumber;
    private String aadharNumber;
}
