package com.vcube.addressservice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.addressservice.model.Address;
import com.vcube.addressservice.repo.AddressRepo;
import com.vcube.addressservice.response.AddressResponse;

@Service
public class AddressService {
	@Autowired
	AddressRepo addressRepo;
	@Autowired
	ModelMapper modelMapper;
	public AddressResponse findAddressByEmployeeId(Integer empid) {
		Optional<Address> address=addressRepo.findAddressByEmployeeId(empid);
		AddressResponse addressResponse=modelMapper.map(address,AddressResponse.class );
		return addressResponse;
	}

}

//@Service
//public class AddressService {
//
//    @Autowired
//    AddressRepo addressRepo;
//
//    public AddressResponse findAddressByEmployeeId(Integer empid) {
//
//        Optional<Address> address =
//                addressRepo.findAddressByEmployeeId(empid);
//
//        if (address.isPresent()) {
//
//            Address a = address.get();
//
//            AddressResponse response = new AddressResponse();
//
//            response.setId(a.getId());
//            response.setCity(a.getCity());
//            response.setState(a.getState());
//
//            return response;
//        }
//
//        return null;
//    }
//}
