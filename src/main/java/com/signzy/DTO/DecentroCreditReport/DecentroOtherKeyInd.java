package com.signzy.DTO.DecentroCreditReport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecentroOtherKeyInd {
    private String ageOfOldestTrade;
    private String numberOfOpenTrades;
    private String allLinesEVERWritten;
    private String allLinesEVERWrittenIn9Months;
    private String allLinesEVERWrittenIn6Months;

    public void setAgeOfOldestTrade(String ageOfOldestTrade) {
        this.ageOfOldestTrade = ageOfOldestTrade;
    }

    public void setNumberOfOpenTrades(String numberOfOpenTrades) {
        this.numberOfOpenTrades = numberOfOpenTrades;
    }

    public void setAllLinesEVERWritten(String allLinesEVERWritten) {
        this.allLinesEVERWritten = allLinesEVERWritten;
    }

    public void setAllLinesEVERWrittenIn9Months(String allLinesEVERWrittenIn9Months) {
        this.allLinesEVERWrittenIn9Months = allLinesEVERWrittenIn9Months;
    }

    public void setAllLinesEVERWrittenIn6Months(String allLinesEVERWrittenIn6Months) {
        this.allLinesEVERWrittenIn6Months = allLinesEVERWrittenIn6Months;
    }
}
