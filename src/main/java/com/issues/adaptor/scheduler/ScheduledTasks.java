package com.issues.adaptor.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.issues.adaptor.repository.ThirdPartyIssueRepository;

@Component
public class ScheduledTasks {
	
	@Autowired
	ThirdPartyIssueRepository thirdPartyIssueRepository;


	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		//This scheduler task will call the third party slow api for each project id  and  will insert fetched data into issue_db if it is a new data else update existing entries
		//It will evict summaries cache for all keys related to the projectId for which 3rd party API is called .
		
	}
}
