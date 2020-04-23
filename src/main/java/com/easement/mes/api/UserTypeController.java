package com.easement.mes.api;

import com.easement.mes.model.UserType;
import com.easement.mes.repository.UserTypeRepository;
import com.easement.mes.service.UserTypeService;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserTypeController {

    @Autowired
    private UserTypeService userTypeService;

    @ApiOperation(value = "获取用户类型列表", notes = "获取用户类型列表")
    @GetMapping(value = "userTypes")
    @ResponseStatus(HttpStatus.OK)
    public List<UserType> getUserType() {
        return userTypeService.getUserTypeList();
    }

    @ApiOperation(value="添加用户类型", notes="添加用户类型")
    @PostMapping(value = "/userTypes")
    @ResponseStatus(HttpStatus.CREATED)
    public Object addUser(@RequestBody UserType userType){
        return userTypeService.addUserType(userType);
    }

    @ApiOperation(value="获取用户类型信息", notes="根据id获取用户类型信息")
    @GetMapping(value = "/userTypes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Object getUser(@PathVariable("id") long id) throws NotFoundException
    {
        return userTypeService.getUserType(id);
    }


}
