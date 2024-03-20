package com.database.integration.mysql.importer.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MonogCharacterDto {

    private Long mysqlId;
    private String name;
    private String pictureUrl;
    private String homeworld;
}
