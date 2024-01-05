package com.signzy.DTO.DecentroCreditReport;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroMapData {
    private DecentroMapIDAndContactInfo idAndContactInfo;
    private DecentroMapScoreDetails scoreDetails;
    private DecentroMapError error;

}