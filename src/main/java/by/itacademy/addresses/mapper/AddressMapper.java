package by.itacademy.addresses.mapper;

import by.itacademy.addresses.dto.AddressResponseDto;
import by.itacademy.addresses.entities.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressResponseDto mapToAddressResponse(Address address);
}
