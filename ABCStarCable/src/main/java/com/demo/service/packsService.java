package com.demo.service;

import java.util.List;

import com.demo.model.packs;

public interface packsService {
	
	List<packs> getAllpacks();

	void addnewpacks(packs e);

	packs getById(int id);

	void updateById(packs e);

	void deleteById(int id);

}
