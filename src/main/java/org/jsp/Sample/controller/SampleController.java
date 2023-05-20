package org.jsp.Sample.controller;

import org.jsp.Sample.dto.Sample;
import org.jsp.Sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@Autowired
	Sample sample;

	@Autowired
	SampleRepository repository;

	@PostMapping("save")
	@ResponseBody
	public String save(@RequestParam String name, @RequestParam long mobile) {
		sample.setName(name);
		sample.setMobile(mobile);
		repository.save(sample);
		return "<h1>Data Saved Succesfully</h1>";
	}
}
