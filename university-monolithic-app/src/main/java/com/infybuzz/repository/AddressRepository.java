package com.infybuzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infybuzz.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
