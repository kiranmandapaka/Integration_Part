package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroCCRResponse {
    private String status;
    private List<DecentroCIRReportDataLst> cIRReportDataLst;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setcIRReportDataLst(List<DecentroCIRReportDataLst> cIRReportDataLst) {
        this.cIRReportDataLst = cIRReportDataLst;
    }
}
