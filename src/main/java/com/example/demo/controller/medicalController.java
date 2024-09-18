package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.medicalEntity;
import com.example.demo.service.medicalService;

@RestController
public class medicalController {
	
	@Autowired
	private medicalService mService;

	@GetMapping("/view")
	public List<medicalEntity> getData() {
		return mService.readData();
	}
	
	@PostMapping("/add")
	public String addData(@RequestBody medicalEntity m) {
		return mService.createData(m);
	}
	
	@PutMapping("/update")
	public String updateData(@RequestBody medicalEntity m) {
		return mService.updateData(m);
	}
	
	@GetMapping("/delete")
	public String deleteData(@RequestParam Integer id) {
		return mService.deleteData(id);
	}
	
	
}
