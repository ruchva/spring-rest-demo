package com.edv.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edv.demo.dao.ParticipantDao;
import com.edv.demo.model.Holder;
import com.edv.demo.model.Participant;

@Service("participantService")
@Transactional
public class ParticipantServiceImpl implements ParticipantService{
	
	@Autowired
	ParticipantDao _participantDao;
	
	@Override
	public void saveParticipant(Participant participant) {
		// TODO Auto-generated method stub
		_participantDao.saveParticipant(participant);
	}

	@Override
	public Holder findByIdParticipant(Long idParticipant) {
		// TODO Auto-generated method stub
		return null;
	}

}
