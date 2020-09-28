package com.lealpha.learningwhilesleeping.repository;

import com.lealpha.learningwhilesleeping.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "userses", path= "users")
public interface UserRepository extends JpaRepository <Users, Long>{
}
