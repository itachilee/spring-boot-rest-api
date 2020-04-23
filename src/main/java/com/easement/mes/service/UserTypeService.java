package com.easement.mes.service;

import com.easement.mes.model.UserType;
import com.easement.mes.repository.UserTypeRepository;
import com.easement.mes.util.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeService {
    @Autowired
    private UserTypeRepository userTypeRepository;

    /**
     * 添加用户类型
     * @param userType
     * @return
     */
    public UserType addUserType(UserType userType){
        return userTypeRepository.save(userType);
    }

    public List<UserType> getUserTypeList(){
        return userTypeRepository.findAll();
    }


    public UserType getUserType(Long id){
        return userTypeRepository.findById(id).orElse(null);
    }
    public void deleteUserType(Long id){
        userTypeRepository.deleteById(id);
    }

    /**
     * 为空的字段不进行更新
     * @param id
     * @param userType
     * @return
     */
    public UserType update(long id,UserType userType){
        UserType userTypeInstance =userTypeRepository.findById(id).orElse(null);
        String[] nullPropertyNames = Util.getNullPropertyNames(userType);
        BeanUtils.copyProperties(userType,userTypeInstance,nullPropertyNames);
        return userTypeRepository.save(userTypeInstance);
    }
}
