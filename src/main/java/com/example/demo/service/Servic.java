package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Alien;
import com.example.demo.dao.Dao;

@Service
public class Servic {
	Dao dao;
	public Servic(Dao dao){
		this.dao = dao;
	}
	public ResponseEntity<String> posting(Alien a) {
		dao.save(a);
		return ResponseEntity.ok("hello");
	}
	public ResponseEntity<List<Alien>> getting() {
		
		return ResponseEntity.ok(dao.findAll());
	}
}
