package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroMapAddressInfo {
    private String seq;
    private String reportedDate;
    private String address;
    private String state;
    private String postal;

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }
}
