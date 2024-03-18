package com.database.integration.mysql.repository;

import com.database.integration.mysql.model.MysqlHomeworld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlHomeworldRepository extends JpaRepository<MysqlHomeworld, Long> {
}
