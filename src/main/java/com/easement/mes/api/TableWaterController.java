package com.easement.mes.api;

import com.easement.mes.model.TableWater;
import com.easement.mes.service.TableWaterService;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author leon
 */
@RestController
@RequestMapping("/api/v1")
public class TableWaterController {


    @Autowired
    private TableWaterService tableUserService;

    @ApiOperation(value = "获取用户类型列表", notes = "获取用户类型列表")
    @GetMapping(value = "tableWaters")
    @ResponseStatus(HttpStatus.OK)
    public List<TableWater> getUserType() {
        return tableUserService.getTableWaterList();
    }

    @ApiOperation(value = "添加用户类型", notes = "添加用户类型")
    @PostMapping(value = "/tableWaters")
    @ResponseStatus(HttpStatus.CREATED)
    public Object addUserType(@RequestBody TableWater tableWater) {
        return tableUserService.addTableWater(tableWater);
    }

    @ApiOperation(value = "获取用户类型信息", notes = "根据id获取用户类型信息")
    @GetMapping(value = "/tableWaters/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Object getUserType(@PathVariable("id") long id) throws NotFoundException {
        return tableUserService.getTableWater(id);
    }

    @ApiOperation(value = "删除用户类型", notes = "删除用户类型")
    @DeleteMapping(value = "/tableWaters/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        tableUserService.deleteTableWater(id);
    }


    @ApiOperation(value="更新用户", notes="更新用户")
    @PatchMapping(value = "/tableWaters/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TableWater updateUser(@PathVariable("id") long id, @RequestBody TableWater tableWater)
    {
        return tableUserService.update(id, tableWater);
    }
}
