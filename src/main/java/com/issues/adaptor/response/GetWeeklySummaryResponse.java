package com.issues.adaptor.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "project_id", "weekly_summaries" })
public class GetWeeklySummaryResponse {

	@JsonProperty("project_id")
	private String projectId;
	@JsonProperty("weekly_summaries")
	private List<WeeklySummary> weeklySummaries;

}