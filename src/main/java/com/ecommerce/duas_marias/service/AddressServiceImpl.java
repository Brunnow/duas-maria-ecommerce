package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.model.Address;
import com.ecommerce.duas_marias.model.User;
import com.ecommerce.duas_marias.payload.AddressDTO;
import com.ecommerce.duas_marias.repositories.AddressRepository;
import com.ecommerce.duas_marias.repositories.UserRepository;
import com.ecommerce.duas_marias.util.AuthUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
        @Autowired
        private AddressRepository addressRepo;

        @Autowired
        private UserRepository userRepo;

        @Autowired
        private ModelMapper modelMapper;

        @Autowired
        private AuthUtil authUtil;

        @Override
        public AddressDTO createAddress(AddressDTO addressDTO, User user) {
            Address address = modelMapper.map(addressDTO, Address.class);
            address.setUser(user);
            List<Address> addressesList = user.getAddresses();
            addressesList.add(address);
            user.setAddresses(addressesList);
            Address savedAddress = addressRepo.save(address);
            return modelMapper.map(savedAddress, AddressDTO.class);
        }
    }
