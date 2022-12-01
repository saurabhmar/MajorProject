package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cybage.exception.BusinessException;
import com.cybage.model.Feedback;

@RestController
@RequestMapping("/feedbacks")
@CrossOrigin("*")
public class FeedbackController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@PostMapping("/addFeedback")
	public ResponseEntity<?> addFeedback(@RequestBody Feedback feedback) throws BusinessException {
		String url="http://localhost:8080/addFeedback";
		return restTemplate.postForEntity(url,fDto,Object.class);
		
	}


	@DeleteMapping("/feedback/{id}")
	public ResponseEntity<?> deleteFeedback(@PathVariable("id") int id) throws BusinessException {
		String url="http://localhost:8080/feedback/"+id;
		return restTemplate.postForEntity(url,id,Object.class);
		
	}

	@GetMapping("/getAllfeedback")
	public ResponseEntity<?> getAllFeedbacks() {
		String url="http://localhost:8080/getAllfeedback";
		return restTemplate.getForEntity(url,Object.class);
	}

}