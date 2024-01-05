package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroRecentActivities {
    private String accountsDelinquent;
    private String accountsOpened;
    private String totalInquiries;
    private String accountsUpdated;

    public void setAccountsDelinquent(String accountsDelinquent) {
        this.accountsDelinquent = accountsDelinquent;
    }

    public void setAccountsOpened(String accountsOpened) {
        this.accountsOpened = accountsOpened;
    }

    public void setTotalInquiries(String totalInquiries) {
        this.totalInquiries = totalInquiries;
    }

    public void setAccountsUpdated(String accountsUpdated) {
        this.accountsUpdated = accountsUpdated;
    }
}
