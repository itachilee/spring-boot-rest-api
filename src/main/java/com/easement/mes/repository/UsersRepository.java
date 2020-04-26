package com.easement.mes.repository;

import com.easement.mes.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    /**
     * 使用名称查询用户
     * @param userName
     * @return 返回用户实体
     */
    Users findByUserName(String userName);
}