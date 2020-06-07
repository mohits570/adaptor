package com.issues.adaptor.response;

import java.util.List;

import org.threeten.extra.YearWeek;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "week", "state_summaries" })
public class WeeklySummary {

	@JsonProperty("week")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY'W'ww")
	private YearWeek week;
	@JsonProperty("state_summaries")
	private List<StateSummary> stateSummaries;

}