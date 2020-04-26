package com.easement.mes.repository;

import com.easement.mes.model.TableWater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableWaterRepository extends JpaRepository<TableWater, Long> {
}
