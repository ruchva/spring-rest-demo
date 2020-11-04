package com.edv.demo.service;

import com.edv.demo.model.Holder;
import com.edv.demo.model.Participant;

public interface ParticipantService {
	
	void saveParticipant (Participant participant);
	
	Holder findByIdParticipant(Long idParticipant);
}
