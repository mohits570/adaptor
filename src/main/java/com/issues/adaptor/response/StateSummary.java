package com.issues.adaptor.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "state", "count", "issues" })
public class StateSummary {

	@JsonProperty("state")
	private String state;
	@JsonProperty("count")
	private Integer count;
	@JsonProperty("issues")
	private List<Issue> issues;

}