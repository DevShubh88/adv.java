package com.demo.dao;

import java.util.List;

import com.demo.model.packs;


public interface packsDao {
	
	List<packs> findAllpacks();

	void save(packs e);

	packs findById(int pid);

	void modifypacks(packs e);

	void removeById(int id);

}
