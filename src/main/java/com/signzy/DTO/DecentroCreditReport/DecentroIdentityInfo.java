package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroIdentityInfo {
    private ArrayList<DecentroPANId> pANId;
    private ArrayList<DecentroRationCard> rationCard;
    private ArrayList<DecentroOtherId> otherId;

    public void setpANId(ArrayList<DecentroPANId> pANId) {
        this.pANId = pANId;
    }

    public void setRationCard(ArrayList<DecentroRationCard> rationCard) {
        this.rationCard = rationCard;
    }

    public void setOtherId(ArrayList<DecentroOtherId> otherId) {
        this.otherId = otherId;
    }
}
