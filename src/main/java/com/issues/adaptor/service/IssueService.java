package com.issues.adaptor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issues.adaptor.repository.IssueRepository;
import com.issues.adaptor.request.GetIssuesRequest;
import com.issues.adaptor.request.GetWeeklySummaryRequest;
import com.issues.adaptor.response.GetIssuesResponse;
import com.issues.adaptor.response.GetWeeklySummaryResponse;

@Service
public class IssueService {
	
	@Autowired
	private IssueRepository issueRepository;

	public GetWeeklySummaryResponse getWeeklySummary(GetWeeklySummaryRequest request) {
		GetIssuesResponse getIssuesResponse = issueRepository.getIssues(request.getProjectId());
		return null;
	}

	private GetIssuesRequest populateGetIssueRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
