package com.budi.boot.controller;

import com.budi.boot.domain.TestTable;
import com.budi.boot.service.TestTableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DMController {
    @Resource
    private TestTableService service;
    @RequestMapping("/testA")
    @ResponseBody
    public String testA(){
        return "testA";
    }

    @GetMapping("/getAll")
    public List<TestTable> getAll(){
       return service.getAllData();
    }
    @GetMapping(value = "/getById/{id}")
    public TestTable getTestTableById(@PathVariable("id")Integer id){
        return service.getTestTableById(id);
    }
}
