package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.*;
import com.example.demo.repository.medicalRepository;

@Service
public class medicalService {
	
	@Autowired
	private medicalRepository mRepo;
	
	public String createData(medicalEntity data) {
		mRepo.save(data);
		return "Data Saved";
	}
	
	public List<medicalEntity> readData() {
		return mRepo.findAll();
	}
	
	public String updateData(medicalEntity data) {
		
		medicalEntity obj=mRepo.findById(data.getId()).orElseThrow(null);
		
		obj.setId(data.getId());
		obj.setDescription(data.getDescription());
		obj.setName(data.getName());
		obj.setPrice(data.getPrice());
		
		mRepo.save(obj);
		return "Data Updated";
	}
	
	public String deleteData(Integer id) {
		
		mRepo.deleteById(id);
		
		return "Data Deleted";
	}
}
