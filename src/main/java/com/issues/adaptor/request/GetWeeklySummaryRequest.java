package com.issues.adaptor.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "project_id", "from_week", "to_week", "types", "states" })
public class GetWeeklySummaryRequest {

	@JsonProperty("project_id")
	private String projectId;
	@JsonProperty("from_week")
	private String fromWeek;
	@JsonProperty("to_week")
	private String toWeek;
	@JsonProperty("types")
	private List<String> types;
	@JsonProperty("states")
	private List<String> states;

}