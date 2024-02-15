package by.itacademy.addresses.service;

import by.itacademy.addresses.dto.AddressResponseDto;
import by.itacademy.addresses.entities.Address;
import by.itacademy.addresses.mapper.AddressMapper;
import by.itacademy.addresses.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public List<AddressResponseDto> getAddressByCompanyName(String companyName) {
        final List<Address> addresses = addressRepository.findByCompanyName(companyName);
        return addresses.stream()
                .map(addressMapper::mapToAddressResponse)
                .toList();
    }
}
