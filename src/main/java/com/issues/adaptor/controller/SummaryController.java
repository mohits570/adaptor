package com.issues.adaptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issues.adaptor.request.GetWeeklySummaryRequest;
import com.issues.adaptor.response.GetWeeklySummaryResponse;
import com.issues.adaptor.service.IssueService;

@RestController
@RequestMapping("/summary")
public class SummaryController {
	
	@Autowired
	IssueService issueService;

	@PostMapping("/weekly")
	public GetWeeklySummaryResponse getWeeklySummary(@RequestBody GetWeeklySummaryRequest request) {
		return issueService.getWeeklySummary(request);
	}
}
