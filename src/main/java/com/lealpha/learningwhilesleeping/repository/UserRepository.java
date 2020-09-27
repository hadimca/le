package com.lealpha.learningwhilesleeping.repository;

import com.lealpha.learningwhilesleeping.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Long>{
}
