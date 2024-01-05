package com.signzy.DTO.GSTIN;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GSTINAggregateTurnOverRange {
    private int minimum;
    private int maximum;
}
