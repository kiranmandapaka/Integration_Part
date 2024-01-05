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
public class DecentroScoreDetails {
    private String type;
    private String version;
    private String name;
    private String value;
    private ArrayList<DecentroScoringElements> scoringElements;

    public void setType(String type) {
        this.type = type;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setScoringElements(ArrayList<DecentroScoringElements> scoringElements) {
        this.scoringElements = scoringElements;
    }
}
