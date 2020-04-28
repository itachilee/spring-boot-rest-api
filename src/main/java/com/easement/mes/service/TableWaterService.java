package com.easement.mes.service;

import com.easement.mes.model.TableWater;
import com.easement.mes.repository.TableWaterRepository;
import com.easement.mes.util.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author leon
 */
@Service
public class TableWaterService {
    @Autowired
    private TableWaterRepository userTypeRepository;

    /**
     * 添加水表
     * @param tableWater
     * @return
     */
    public TableWater addTableWater(TableWater tableWater){
        return userTypeRepository.save(tableWater);
    }

    public List<TableWater> getTableWaterList(){
        return userTypeRepository.findAll();
    }


    public TableWater getTableWater(Long id){
        return userTypeRepository.findById(id).orElse(null);
    }
    public void deleteTableWater(Long id){
        userTypeRepository.deleteById(id);
    }

    /**
     * 为空的字段不进行更新
     * @param id
     * @param tableWater
     * @return
     */
    public TableWater update(long id,TableWater tableWater){
        TableWater tableWaterInstance =userTypeRepository.findById(id).orElse(null);
        String[] nullPropertyNames = Util.getNullPropertyNames(tableWater);

        BeanUtils.copyProperties(tableWater,tableWaterInstance,nullPropertyNames);
        return userTypeRepository.save(tableWaterInstance);
    }
}
