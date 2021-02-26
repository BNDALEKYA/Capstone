package com.tavant.trackad.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tavant.trackad.repository.AddressRepository;


 
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    
    @Autowired
    
    private AddressRepository addressRepository;

 

    @Override
    public List<String> search(String keyword) {
        // TODO Auto-generated method stub
        return addressRepository.search(keyword);
    }
    

 

}