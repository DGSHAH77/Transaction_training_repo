package com.cts.capstone.vnf.service;

import java.util.List;

import com.cts.capstone.vnf.entity.VnfDetails;

public interface VnfDetailsServices {

	VnfDetails serviceById (Integer Id);
	VnfDetails serviceByName (String name);
	VnfDetails serviceByNameandSize (String name, char size); 
	List<VnfDetails> allServices ();
}
