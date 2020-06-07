package com.issues.adaptor.request;

import java.util.List;

import org.threeten.extra.YearWeek;

import com.fasterxml.jackson.annotation.JsonFormat;
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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY'W'ww")
	private YearWeek fromWeek;

	@JsonProperty("to_week")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY'W'ww")
	private YearWeek toWeek;

	@JsonProperty("types")
	private List<String> types;

	@JsonProperty("states")
	private List<String> states;

}