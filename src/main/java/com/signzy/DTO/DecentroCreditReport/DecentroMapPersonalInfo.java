package com.signzy.DTO.DecentroCreditReport;

import lombok.*;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class DecentroMapPersonalInfo {
    private DecentroName name;
    private String dateOfBirth;
    private String gender;
    private DecentroAge age;

    public void setName(DecentroName name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(DecentroAge age) {
        this.age = age;
    }
}
