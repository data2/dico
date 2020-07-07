package com.data2.salmon.core;

import com.data2.salmon.core.cache.impl.SqlConfigCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author leewow
 */
@Component
public class ParseConfig {

    @Autowired
    private SqlConfigCache sqlConfigCache;

    public String parse(String file, ExecuteSql executeSql) {
        String mapperFile = "src/main/resources/mapper/".concat(file).concat(".salmon");
        return (String) sqlConfigCache.getSource(mapperFile, executeSql.getSqlId());
    }

}
