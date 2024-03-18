package com.database.integration.mysql.repository;

import com.database.integration.mysql.model.MysqlCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlCharacterRepository extends JpaRepository<MysqlCharacter, Long> {
}