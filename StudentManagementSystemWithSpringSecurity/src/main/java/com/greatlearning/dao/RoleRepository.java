package com.greatlearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
