package com.edv.demo.controller;

import com.edv.demo.model.Holder;
import com.edv.demo.service.HolderService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v1")
public class HolderController {	
	@Autowired
	HolderService _holderService;	
	//GET
	@RequestMapping(value="/holders", method = RequestMethod.GET, headers = "Accept=applicantion/json")
	public ResponseEntity<List<Holder>> getHolders(){		
		List<Holder> holders = new ArrayList<>();
		holders = _holderService.findAllHolder();
		if(holders.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}		
		return new ResponseEntity<List<Holder>>(holders,HttpStatus.OK);
	}
	//GET
	@RequestMapping(value="/holders/{id}", method = RequestMethod.GET, headers = "Accept=applicantion/json")
	public ResponseEntity<Holder> getHoldersById(@PathVariable("id") Long idHolderPk){
		if(idHolderPk == null || idHolderPk <= 0) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}		
		Holder holder = _holderService.findById(idHolderPk);		
		if(holder == null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}		
		return new ResponseEntity<Holder>(holder,HttpStatus.OK);
	}	
	//POST
//	@RequestMapping(value="/holders", method = RequestMethod.POST, headers = "Accept=applicantion/json")
}
