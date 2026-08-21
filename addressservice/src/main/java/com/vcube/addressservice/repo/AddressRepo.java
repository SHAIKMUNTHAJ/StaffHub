package com.vcube.addressservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vcube.addressservice.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {
 @Query(nativeQuery=true,value= "SELECT a.id, a.city, a.state " +
         "FROM Address AS a " +
         "JOIN Employee70 AS e ON e.id = a.id WHERE a.id = :empid")
	Optional<Address> findAddressByEmployeeId(Integer empid);

}
