package com.edv.demo.dao;

import com.edv.demo.model.Holder;
import com.edv.demo.model.Participant;

public interface ParticipantDao {
	
	void saveParticipant (Participant participant);
	
	Holder findByIdParticipant(Long idParticipant);
	
}
