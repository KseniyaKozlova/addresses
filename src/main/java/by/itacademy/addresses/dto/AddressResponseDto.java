package by.itacademy.addresses.dto;

import lombok.Data;

@Data
public class AddressResponseDto {

    private String companyName;

    private String city;

    private String streetName;

    private Integer houseNumber;
}
