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
public class DecentroCIRReportData {
    private DecentroIDAndContactInfo iDAndContactInfo;
    private DecentroRetailAccountsSummary retailAccountsSummary;
    private List<DecentroScoreDetails> scoreDetails;
    private DecentroOtherKeyInd otherKeyInd;
    private DecentroRecentActivities recentActivities;

    public void setiDAndContactInfo(DecentroIDAndContactInfo iDAndContactInfo) {
        this.iDAndContactInfo = iDAndContactInfo;
    }

    public void setRetailAccountsSummary(DecentroRetailAccountsSummary retailAccountsSummary) {
        this.retailAccountsSummary = retailAccountsSummary;
    }

    public void setScoreDetails(List<DecentroScoreDetails> scoreDetails) {
        this.scoreDetails = scoreDetails;
    }

    public void setOtherKeyInd(DecentroOtherKeyInd otherKeyInd) {
        this.otherKeyInd = otherKeyInd;
    }

    public void setRecentActivities(DecentroRecentActivities recentActivities) {
        this.recentActivities = recentActivities;
    }
}
