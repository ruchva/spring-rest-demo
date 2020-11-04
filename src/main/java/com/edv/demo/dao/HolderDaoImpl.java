package com.edv.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.edv.demo.model.Holder;

@Repository
@Transactional
public class HolderDaoImpl extends AbstractSession implements HolderDao {
		
	@Override
	public void saveHolder(Holder holder) {
		getSession().persist(holder);
	}

	@Override
	public void updateHolder(Holder holder) {
		getSession().update(holder);
	}

	@Override
	public void deleteHolderById(Long idHolder) {
		Holder holder = findById(idHolder);
		if(holder != null)
			getSession().delete(holder);
	}

	@Override
	public List<Holder> findAllHolder() {
		return getSession().createQuery("select h.fullName, h.documentNumber from Holder h").setMaxResults(10).list();
//		return getSession().createQuery("FROM " + Holder.class.getSimpleName()).list();
	}

	@Override
	public Holder findById(Long idHolder) {
		return (Holder) getSession().get(Holder.class, idHolder);
	}

	@Override
	public Holder findByFullName(String fullName) {
		return (Holder) getSession().createQuery("from Holder where fullName = :fullName")
				.setParameter("fullName", fullName)
				.uniqueResult();
	}

}
