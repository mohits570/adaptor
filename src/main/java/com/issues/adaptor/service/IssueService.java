package com.issues.adaptor.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.threeten.extra.YearWeek;

import com.issues.adaptor.entity.ChangeLogEntity;
import com.issues.adaptor.repository.ChangeLogRepository;
import com.issues.adaptor.request.GetWeeklySummaryRequest;
import com.issues.adaptor.response.GetWeeklySummaryResponse;
import com.issues.adaptor.util.YearWeekUtil;

@Service
public class IssueService {

	@Autowired
	private ChangeLogRepository changeLogRepository;

	public GetWeeklySummaryResponse getSummary(GetWeeklySummaryRequest request) {
		return getWeeklySummary(request.getProjectId(), request.getFromWeek(), request.getToWeek(), request.getStates(),
				request.getTypes());
	}

	/**
	 * Caching response with a key based on all method arguments(i.e. request params).
	 *
	 */
	@Cacheable(cacheNames = "summaries", sync = true, key = "#projectId + #fromYearWeek.toString() + #toYearWeek.toString() + #states.toString() + #types.toString()")
	private GetWeeklySummaryResponse getWeeklySummary(String projectId, YearWeek fromYearWeek, YearWeek toYearWeek,
			List<String> states, List<String> types) {
		GetWeeklySummaryResponse response = null;

		// fetches changelogs with project id, yearWeek range, types, states
		List<ChangeLogEntity> changeLogs = changeLogRepository.getChangeLogsByProjectIdDateRangeTypesAndStates(
				projectId, YearWeekUtil.intOf(fromYearWeek), YearWeekUtil.intOf(toYearWeek), types, states);

		// groups data by yearWeek
		Map<Integer, List<ChangeLogEntity>> weeklyChangeLog = changeLogs.stream()
				.collect(Collectors.groupingBy(cl -> cl.getYearWeek()));

		// Now response could be populated by above weeklyChangeLog map

		return response;
	}

}
