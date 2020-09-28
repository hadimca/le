package com.lealpha.learningwhilesleeping.repository;

import com.lealpha.learningwhilesleeping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
