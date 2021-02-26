package com.tavant.trackad.controllers;



 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

 

import javax.validation.Valid;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.trackad.models.Address;
import com.tavant.trackad.repository.AddressRepository;





 


@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class AddressController {
    
    @Autowired
    AddressRepository addressRepository;
    
    @PostMapping("/saveaddress")//it is used to post the employee object to db
    public Address addAddress(@RequestBody @Valid Address address){
       
        return addressRepository.save(address);
    }
    @GetMapping("/getaddress")//it is used to post the employee object to db
    public List<Address> getAddress(){
        List<Address> address=new ArrayList<Address>();
        address=addressRepository.findAll();
        return address;
    }
//    @GetMapping("/all")//it is used to get all the employee details
//    public List <Address> getAllAddress() 
//    {
//        List<Address> list=this.addressRepository.findAll();
//        return Optional.ofNullable(list.isEmpty()?null:list).orElseThrow(()->new NoDataFoundException("no data found"));
//        
//    }

 

}