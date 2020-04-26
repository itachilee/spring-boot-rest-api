package com.easement.mes.repository;

import com.easement.mes.model.TableUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface TableUserRepository extends JpaRepository<TableUser,Long> {

}
