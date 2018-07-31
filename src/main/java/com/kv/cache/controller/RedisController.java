package com.kv.cache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kv.cache.model.CacheRequest;
import com.kv.cache.model.Grid;
import com.kv.cache.service.RedisService;

@RestController
public class RedisController {

	@Autowired
	private RedisService redisService;
	
	@RequestMapping("/add")
	public @ResponseBody Grid add(@RequestBody CacheRequest grid){
		Grid g = new Grid(grid.getKey(), grid.getResponse());
		return redisService.saveOrUpdate(g);
	}
	
	@RequestMapping("/fetchall")
	public @ResponseBody List<Grid> fetchAll(){
		return redisService.listAll();
	}
}
