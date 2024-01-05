package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroScoringElements {
    private String type;
    private String seq;
    private String code;
    private String description;

    public void setType(String type) {
        this.type = type;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
