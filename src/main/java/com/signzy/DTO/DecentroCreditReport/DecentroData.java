package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroData {
    private DecentroCCRResponse cCRResponse;

    public void setcCRResponse(DecentroCCRResponse cCRResponse) {
        this.cCRResponse = cCRResponse;
    }
}