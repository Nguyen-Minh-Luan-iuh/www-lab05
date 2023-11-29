package com.www.lab5.dtos;

import com.www.lab5.enums.Country;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompanyDto {
    private String companyName;
    private String companyEmail;
    private String companyPhone;
    private String companyWebUrl;
    private String companyAbout;
    private String companyStreet;
    private String companyCity;
    private String companyCountry;
    private String companyNumber;
    private String companyZipcode;
}
