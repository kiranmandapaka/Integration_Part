package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroPhoneInfo {
    private String seq;
    private String typeCode;
    private String reportedDate;
    private String number;

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
