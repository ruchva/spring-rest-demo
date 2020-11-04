package com.edv.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edv.demo.dao.HolderDao;
import com.edv.demo.model.Holder;

@Service("holderService")
@Transactional
public class HolderServiceImpl implements HolderService{
	
	@Autowired
	private HolderDao _holderDao;
	
	
	@Override
	public void saveHolder(Holder holder) {
		// TODO Auto-generated method stub
		_holderDao.saveHolder(holder);
	}

	@Override
	public void updateHolder(Holder holder) {
		// TODO Auto-generated method stub
		_holderDao.updateHolder(holder);
	}

	@Override
	public void deleteHolderById(Long idHolder) {
		// TODO Auto-generated method stub
		_holderDao.deleteHolderById(idHolder);
	}

	@Override
	public List<Holder> findAllHolder() {
		// TODO Auto-generated method stub
		return _holderDao.findAllHolder();
	}

	@Override
	public Holder findById(Long idHolder) {
		// TODO Auto-generated method stub
		return _holderDao.findById(idHolder);
	}

	@Override
	public Holder findByFullName(String fullName) {
		// TODO Auto-generated method stub
		return _holderDao.findByFullName(fullName);
	}

}
