package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.model.User;
import com.ecommerce.duas_marias.payload.AddressDTO;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
}
