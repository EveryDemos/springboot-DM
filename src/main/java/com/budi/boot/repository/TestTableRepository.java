package com.budi.boot.repository;

import com.budi.boot.domain.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestTableRepository extends JpaRepository<TestTable,Integer> {
}
