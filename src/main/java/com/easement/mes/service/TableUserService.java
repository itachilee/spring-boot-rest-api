package com.easement.mes.service;


import com.easement.mes.model.TableUser;
import com.easement.mes.repository.TableUserRepository;
import com.easement.mes.util.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leon
 */
@Service
public class TableUserService {

    @Autowired
    private TableUserRepository tableUserRepository;

    /**
     * 添加用户
     *
     * @param tableUser
     * @return
     */
    public TableUser addTableUser(TableUser tableUser) {
        return tableUserRepository.save(tableUser);
    }

    public List<TableUser> getTableUserList() {
        return tableUserRepository.findAll();
    }

    public TableUser getTableUser(long id) {
        return tableUserRepository.findById(id).orElse(null);
    }

    public void deleteTableUser(long id) {
        tableUserRepository.deleteById(id);
    }

    public TableUser update(long id, TableUser tableUser) {
        TableUser userInstance = tableUserRepository.findById(id).orElse(null);
        String[] nullPropertyNames = Util.getNullPropertyNames(tableUser);
        BeanUtils.copyProperties(tableUser, userInstance, nullPropertyNames);
        return tableUserRepository.save(userInstance);
    }
}
