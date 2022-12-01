

package com.cybage.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Feedback;
import com.cybage.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/addfeedback")
	public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback) {
		Feedback feedback1 = feedbackService.addFeedback(feedback);
		return new ResponseEntity<String>("record added successfully", HttpStatus.CREATED);

	}

	@GetMapping("/getallfeedbacks")
	public ResponseEntity<List<Feedback>> getAllFeedbacks() {
		List<Feedback> feedbackList = feedbackService.getAllFeedbacks(null);
		return new ResponseEntity<List<Feedback>>(feedbackList, HttpStatus.OK);
	}


	///DELETE feedback

	@DeleteMapping("/delete{id}")
	public ResponseEntity<String> deleteFeedback(@PathVariable int id) {
		feedbackService.deleteFeedback(id);
		Feedback feedback = feedbackService.getFeedbackById(id);

		return new ResponseEntity<String>("Feedback deleteddddd successfully", HttpStatus.CREATED);

	}





























































