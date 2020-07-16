package com.budi.boot.service;

import com.budi.boot.domain.TestTable;

import java.util.List;

public interface TestTableService {
    List<TestTable> getAllData();
    TestTable getTestTableById(Integer id);
}
