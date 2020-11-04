package com.edv.demo.dao;

import java.util.List;

import com.edv.demo.model.Holder;

public interface HolderDao {
	
	void saveHolder(Holder holder);

	void updateHolder(Holder holder);
	
	void deleteHolderById(Long idHolder);
	
	List<Holder> findAllHolder();
	
	Holder findById(Long idHolder);

	Holder findByFullName(String fullName);
	
}
