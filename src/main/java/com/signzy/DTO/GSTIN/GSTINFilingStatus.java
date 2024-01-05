package com.signzy.DTO.GSTIN;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GSTINFilingStatus {
        private String filingYear;
        private String monthOfFiling;
        private String methodOfFilling;
        private String dateOfFiling;
        private String gstType;
        private String gstStatus;
    }

