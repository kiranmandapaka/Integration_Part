package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DecentroMapIDAndContactInfo {
    private DecentroMapPersonalInfo personalInfo;
    private List<DecentroMapAddressInfo> addressInfo;



}
