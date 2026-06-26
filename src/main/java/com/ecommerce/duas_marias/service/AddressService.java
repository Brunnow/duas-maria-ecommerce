package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.model.User;
import com.ecommerce.duas_marias.payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);

    List<AddressDTO> getAddresses();
}
