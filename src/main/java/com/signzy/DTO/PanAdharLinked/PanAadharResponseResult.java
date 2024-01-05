package com.signzy.DTO.PanAdharLinked;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanAadharResponseResult {
    private Boolean linked;
    private String uid;
    private String message;
    private String code;
}
