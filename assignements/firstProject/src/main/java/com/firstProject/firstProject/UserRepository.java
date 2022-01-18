package com.firstProject.firstProject;
// the last part of service dao - repository part
// this part is just an interface uses implementation of spring data jpa

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
// the extends crudrepostory gets all the required crud operations
// required all the types
public interface UserRepository extends JpaRepository<Users,String> {
    // for all the crud operations and applicable to all the entities

}
