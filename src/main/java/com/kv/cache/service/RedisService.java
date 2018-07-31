package com.kv.cache.service;

import java.util.List;
import java.util.Map;

import com.kv.cache.model.CacheRequest;
import com.kv.cache.model.Grid;

public interface RedisService {
    
    List<Grid> listAll();

    Grid getById(String gridId);

    Grid saveOrUpdate(Grid grid);

    void delete(String gridId);

}
