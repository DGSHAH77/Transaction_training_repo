package com.cts.capstone.vnf.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.capstone.vnf.controller.request.ServiceId;
import com.cts.capstone.vnf.entity.VnfDetails;
import com.cts.capstone.vnf.service.VnfDetailsServices;

@RestController
@RequestMapping("/vnf/services")
public class VnfDetailsController {
	
	@Autowired
	VnfDetailsServices vnfDetail;
	
@GetMapping(value="findServiceById", produces="application/json")
	public ResponseEntity<Object> findServiceById(@RequestBody ServiceId id) {
		
		VnfDetails vnfDetails =  vnfDetail.serviceById(id.getId());
		return new ResponseEntity<Object>(vnfDetails,HttpStatus.ACCEPTED);
		
		
	}

}
