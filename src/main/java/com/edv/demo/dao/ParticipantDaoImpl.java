package com.edv.demo.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.edv.demo.model.Holder;
import com.edv.demo.model.Participant;

@Repository
@Transactional
public class ParticipantDaoImpl extends AbstractSession implements ParticipantDao {

	@Override
	public void saveParticipant(Participant participant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Holder findByIdParticipant(Long idParticipant) {
		return (Holder) getSession().createQuery("from Participant p join p.holder where p.idParticipantPk = :idParticipant")
				.setParameter("idParticipant", idParticipant).uniqueResult();
	}

}
