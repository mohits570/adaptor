package com.issues.adaptor.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "week", "state_summaries" })
public class WeeklySummary {

	@JsonProperty("week")
	private String week;
	@JsonProperty("state_summaries")
	private List<StateSummary> stateSummaries ;

}