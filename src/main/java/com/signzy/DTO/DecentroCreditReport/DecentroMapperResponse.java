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
public class DecentroMapperResponse {

    private String decentroTxnId;
    private String status;
    private String responseCode;
    private String message;
    private DecentroMapData data;
    private String responseKey;


}
