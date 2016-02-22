package com.webservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.modal.DailyService;
import com.webservices.repository.DailyServiceRepository;
@Service("dailyBasisServiceImpl")
public class DailyBasisServiceImpl implements DailyBasisService {

	@Autowired
	DailyServiceRepository dailyServiceRepository;
	@Override
	public DailyService storeDailyBasisService(DailyService dailyService) {
		
		return dailyServiceRepository.saveAndFlush(dailyService);
	}
	
	@Override
	public List<DailyService> getDailyBasisService() {
		
		return dailyServiceRepository.findAll();
	}

}