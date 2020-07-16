package com.budi.boot.service.impl;

import com.budi.boot.domain.TestTable;
import com.budi.boot.repository.TestTableRepository;
import com.budi.boot.service.TestTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TestTableServiceImpl implements TestTableService {
    @Resource
    private TestTableRepository repository;
    public List<TestTable> getAllData() {
        return repository.findAll();
    }

    public TestTable getTestTableById(Integer id) {
        TestTable table = repository.findById(id).get();
        return table;
    }
}
