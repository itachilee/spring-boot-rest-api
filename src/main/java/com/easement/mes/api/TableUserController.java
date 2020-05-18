package com.easement.mes.api;

import com.easement.mes.model.TableUser;
import com.easement.mes.service.TableUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author leon
 */
@RestController
@RequestMapping("/api/v1")
public class TableUserController {
    @Autowired
    private TableUserService tableUserService;

    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    @GetMapping(value = "/tableUsers")
    @ResponseStatus(HttpStatus.OK)
    public List<TableUser> getUserType() {
        return tableUserService.getTableUserList();
    }
    @GetMapping("/userLists")
    public ResponseEntity<?> getList(
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="size", defaultValue="10") int size ) {

        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        return new ResponseEntity<Object>(tableUserService.getUserList(pageable), HttpStatus.OK);
    }
    @ApiOperation(value = "添加用户", notes = "添加用户")
    @PostMapping(value = "/tableUsers")
    @ResponseStatus(HttpStatus.CREATED)
    public Object addUser(@RequestBody TableUser tableUser) {
        return tableUserService.addTableUser(tableUser);
    }

    @ApiOperation(value = "获取用户信息", notes = "根据id获取用户信息")
    @GetMapping(value = "/tableUsers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Object getUser(@PathVariable("id") long id) {
        return tableUserService.getTableUser(id);
    }

    @ApiOperation(value = "删除用户", notes = "删除用户")
    @DeleteMapping(value = "/tableUsers/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        tableUserService.deleteTableUser(id);
    }

    @ApiOperation(value="更新用户", notes="更新用户")
    @PatchMapping(value = "/tableUsers/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TableUser updateUser(@PathVariable("id") long id, @RequestBody TableUser tableUser)
    {
        return tableUserService.update(id, tableUser);
    }
}
