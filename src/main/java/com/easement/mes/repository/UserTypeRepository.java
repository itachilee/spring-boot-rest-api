package com.easement.mes.repository;

import com.easement.mes.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository  extends JpaRepository<UserType, Long> {
}
