package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroRetailAccountsSummary {
    private String noOfAccounts;
    private String noOfActiveAccounts;
    private String noOfWriteOffs;
    private String totalPastDue;
    private String singleHighestCredit;
    private String singleHighestSanctionAmount;
    private String totalHighCredit;
    private String averageOpenBalance;
    private String singleHighestBalance;
    private String noOfPastDueAccounts;
    private String noOfZeroBalanceAccounts;
    private String recentAccount;
    private String oldestAccount;
    private String totalBalanceAmount;
    private String totalSanctionAmount;
    private String totalCreditLimit;
    private String totalMonthlyPaymentAmount;

    public void setNoOfAccounts(String noOfAccounts) {
        this.noOfAccounts = noOfAccounts;
    }

    public void setNoOfActiveAccounts(String noOfActiveAccounts) {
        this.noOfActiveAccounts = noOfActiveAccounts;
    }

    public void setNoOfWriteOffs(String noOfWriteOffs) {
        this.noOfWriteOffs = noOfWriteOffs;
    }

    public void setTotalPastDue(String totalPastDue) {
        this.totalPastDue = totalPastDue;
    }

    public void setSingleHighestCredit(String singleHighestCredit) {
        this.singleHighestCredit = singleHighestCredit;
    }

    public void setSingleHighestSanctionAmount(String singleHighestSanctionAmount) {
        this.singleHighestSanctionAmount = singleHighestSanctionAmount;
    }

    public void setTotalHighCredit(String totalHighCredit) {
        this.totalHighCredit = totalHighCredit;
    }

    public void setAverageOpenBalance(String averageOpenBalance) {
        this.averageOpenBalance = averageOpenBalance;
    }

    public void setSingleHighestBalance(String singleHighestBalance) {
        this.singleHighestBalance = singleHighestBalance;
    }

    public void setNoOfPastDueAccounts(String noOfPastDueAccounts) {
        this.noOfPastDueAccounts = noOfPastDueAccounts;
    }

    public void setNoOfZeroBalanceAccounts(String noOfZeroBalanceAccounts) {
        this.noOfZeroBalanceAccounts = noOfZeroBalanceAccounts;
    }

    public void setRecentAccount(String recentAccount) {
        this.recentAccount = recentAccount;
    }

    public void setOldestAccount(String oldestAccount) {
        this.oldestAccount = oldestAccount;
    }

    public void setTotalBalanceAmount(String totalBalanceAmount) {
        this.totalBalanceAmount = totalBalanceAmount;
    }

    public void setTotalSanctionAmount(String totalSanctionAmount) {
        this.totalSanctionAmount = totalSanctionAmount;
    }

    public void setTotalCreditLimit(String totalCreditLimit) {
        this.totalCreditLimit = totalCreditLimit;
    }

    public void setTotalMonthlyPaymentAmount(String totalMonthlyPaymentAmount) {
        this.totalMonthlyPaymentAmount = totalMonthlyPaymentAmount;
    }
}
