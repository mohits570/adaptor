package com.issues.adaptor.repository;

import java.util.Arrays;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.issues.adaptor.response.Changelog;
import com.issues.adaptor.response.GetIssuesResponse;
import com.issues.adaptor.response.Issue;

@Component
public class ThirdPartyIssueRepository implements IssueRepository {

	@Override
	@Cacheable(cacheNames="issues", key="#projectId", sync=true)
	public GetIssuesResponse getIssues(String projectId) {
		simulateSlowService();
		return GetIssuesResponse.builder()
				.projectId("project1")
				.issues(Arrays.asList(new Issue("issue1", "bug", "open",
				Arrays.asList(
						new Changelog("2017-01-01 12:00pm UTC", "open", "in_progress"),
						new Changelog("2017-01-03 12:00pm UTC", "in_progress", "testing"),
						new Changelog("2017-01-21 12:00pm UTC", "testing", "deploy")
						)))).build();
	}

	// Don't do this at home
	private void simulateSlowService() {
		try {
			long time = 3000L;
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

}
