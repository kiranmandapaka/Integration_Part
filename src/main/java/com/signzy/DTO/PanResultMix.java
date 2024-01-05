//package com.signzy.DTO;
//
//import com.fasterxml.jackson.annotation.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Component;
//
//@Component
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
//@JsonInclude(JsonInclude.Include.NON_NULL)
//public abstract class PanResultMix {
//    @JsonProperty("Pan Name")
//    @JsonAlias({"name"})
//    private String name;
//
//    @JsonProperty("Pan Number")
//    @JsonAlias({"number"})
//    private String number;
//
//    @JsonIgnoreProperties("typeOfHolder")
//    private String typeOfHolder;
//    @JsonIgnoreProperties("isIndividual")
//    private boolean isIndividual;
//    @JsonIgnoreProperties("isValid")
//    private boolean isValid;
//    @JsonIgnoreProperties("firstName")
//    private String firstName;
//    @JsonIgnoreProperties("middleName")
//    private String middleName;
//    @JsonIgnoreProperties("lastName")
//    private String lastName;
//    @JsonIgnoreProperties("title")
//    private String title;
//    @JsonIgnoreProperties("panStatus")
//    private String panStatus;
//    @JsonIgnoreProperties("panStatusCode")
//    private String panStatusCode;
//    @JsonIgnoreProperties("aadhaarSeedingStatus")
//    private String aadhaarSeedingStatus;
//    @JsonIgnoreProperties("aadhaarSeedingStatusCode")
//    private String aadhaarSeedingStatusCode;
//    @JsonIgnoreProperties("lastUpdatedOn")
//    private String lastUpdatedOn;
//    @JsonIgnoreProperties("updatetTimestamp")
//    private long updatetTimestamp;
//}
