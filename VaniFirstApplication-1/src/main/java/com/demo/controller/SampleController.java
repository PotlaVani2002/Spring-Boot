package com.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Sample;
import com.demo.repository.SampleRepository;

@RestController
public class SampleController {
	@Autowired
	SampleRepository sr;
	
@GetMapping("/addData")
public String addD(@RequestBody Sample s)
{
	return ""+ sr.save(s);
}
@GetMapping("/deleteData/{id}")
public void addD(@PathVariable int id)
{
	
	 sr.deleteById(id);
	 System.out.println("Record deleted");
}
}
