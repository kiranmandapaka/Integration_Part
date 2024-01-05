package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroCIRReportDataLst {
    private DecentroCIRReportData cIRReportData;
    private DecentroError error;

    public void setcIRReportData(DecentroCIRReportData cIRReportData) {
        this.cIRReportData = cIRReportData;
    }

    public void setError(DecentroError error) {
        this.error = error;
    }
}
