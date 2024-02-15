package by.itacademy.addresses.controller;

import by.itacademy.addresses.dto.AddressResponseDto;
import by.itacademy.addresses.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/version1")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping(path = "/address/{name}")
    public List<AddressResponseDto> getCompanyAddress(@PathVariable(value = "name") String companyName) {
        return addressService.getAddressByCompanyName(companyName);
    }
}
