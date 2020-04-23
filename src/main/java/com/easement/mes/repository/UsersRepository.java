package com.easement.mes.repository;

import com.easement.mes.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByUserName(String userName);
}