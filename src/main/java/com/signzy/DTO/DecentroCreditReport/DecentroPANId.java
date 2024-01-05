package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroPANId {
    private String seq;
    private String reportedDate;
    private String idNumber;

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
