package com.cts.capstone.vnf.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.capstone.vnf.entity.VnfDetails;
import com.cts.capstone.vnf.repository.VnfServiceRepository;

public class VnfDetailServiceImpl implements VnfDetailsServices{
	
	@Autowired
	private VnfServiceRepository vnfRepo;
	
	@Autowired
	EntityManager entityManager;

	@Override
	public VnfDetails serviceById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(VnfDetails.class, id);
	}

	@Override
	public VnfDetails serviceByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VnfDetails serviceByNameandSize(String name, char size) {
		
//		List<ServiceDetails> services = new ArrayList<ServiceDetails>();
//		
//		services = vnfRepo.findAll();
//		
//		services.stream()
//				.fileter(s -> s.getServiceSize() )
		
		return null;
	}

	@Override
	public List<VnfDetails> allServices() {
		// TODO Auto-generated method stub
		return vnfRepo.findAll();
	}

}
