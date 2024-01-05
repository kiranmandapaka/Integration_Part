package com.signzy.DTO.PAN;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignzyPanResult {
    @JsonAlias("Pan Name")
    private String name;
    @JsonAlias("Pan Number")
    private String number;
    @JsonAlias("typeOfHolder")
    private String typeOfHolder;
    @JsonAlias("isIndividual")
    private boolean isIndividual;
    @JsonAlias("isValid")
    private boolean isValid;
    @JsonAlias("firstName")
    private String firstName;
    @JsonAlias("middleName")
    private String middleName;
    @JsonAlias("lastName")
    private String lastName;
    @JsonAlias("title")
    private String title;
    @JsonAlias("panStatus")
    private String panStatus;
    @JsonAlias("panStatusCode")
    private String panStatusCode;
    @JsonAlias("aadhaarSeedingStatus")
    private String aadhaarSeedingStatus;
    @JsonAlias("aadhaarSeedingStatusCode")
    private String aadhaarSeedingStatusCode;
    @JsonAlias("lastUpdatedOn")
    private String lastUpdatedOn;
    @JsonAlias("updatetTimestamp")
    private long updatetTimestamp;
}
