package com.example.demo.model;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Alien;
import com.example.demo.service.Servic;

@RestController
public class Con {
	Servic ser;
	public Con(Servic ser) {
		this.ser = ser;
	}
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Alien a) {
		return ser.posting(a);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Alien>> get(){
		return ser.getting();
	}
	
}
