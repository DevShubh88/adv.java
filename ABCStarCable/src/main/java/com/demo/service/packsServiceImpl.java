package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.packsDao;
import com.demo.model.packs;

@Service
public class packsServiceImpl implements packsService {

	@Autowired
	 private packsDao edao;
	@Override
	public List<packs> getAllpacks() {
		return edao.findAllpacks();
	}

	public void addnewpacks(packs e) {
		edao.save(e);
		
	}

	@Override
	public packs getById(int id) {
		return edao.findById(id);
	}

	@Override
	public void updateById(packs e) {
		edao.modifypacks(e);
		
	}

	@Override
	public void deleteById(int id) {
		edao.removeById(id);
		
	}

	

}
