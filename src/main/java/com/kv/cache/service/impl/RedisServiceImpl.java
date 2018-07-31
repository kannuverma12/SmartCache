package com.kv.cache.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kv.cache.model.Grid;
import com.kv.cache.repository.GridRepository;
import com.kv.cache.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private GridRepository gridRepository;

	@Override
	public List<Grid> listAll() {
		List<Grid> grids = new ArrayList<>();
		gridRepository.findAll().forEach(grids::add);
		return grids;
	}

	@Override
	public Grid getById(String gridId) {
		return gridRepository.findById(gridId).orElse(null);
	}

	@Override
	public Grid saveOrUpdate(Grid grid) {
		gridRepository.save(grid);
		return grid;
	}

	@Override
	public void delete(String gridId) {
		gridRepository.deleteById(gridId);

	}

}
