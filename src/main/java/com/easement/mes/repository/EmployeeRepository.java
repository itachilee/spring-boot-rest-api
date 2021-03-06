package com.easement.mes.repository;

import com.easement.mes.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author leon
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}