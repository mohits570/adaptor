package com.issues.adaptor.repository;

import org.springframework.stereotype.Repository;

import com.issues.adaptor.response.GetIssuesResponse;

@Repository
public interface IssueRepository {
	GetIssuesResponse getIssues(String string);
}
