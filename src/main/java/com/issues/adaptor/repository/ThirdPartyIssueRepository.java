package com.issues.adaptor.repository;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.issues.adaptor.response.Changelog;
import com.issues.adaptor.response.GetIssuesResponse;
import com.issues.adaptor.response.Issue;

@Repository
public class ThirdPartyIssueRepository {

	public GetIssuesResponse getIssues(String projectId) {
		simulateSlowService();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mma z");
		return GetIssuesResponse.builder().projectId("project1")
				.issues(Arrays.asList(new Issue("issue1", "bug", "open", Arrays.asList(
						new Changelog(ZonedDateTime.parse("2017-01-01 12:00PM UTC", formatter), "open", "in_progress"),
						new Changelog(ZonedDateTime.parse("2017-01-03 12:00PM UTC", formatter), "in_progress",
								"testing"),
						new Changelog(ZonedDateTime.parse("2017-01-21 12:00PM UTC", formatter), "testing", "deploy")))))
				.build();
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
