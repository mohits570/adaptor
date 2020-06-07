package com.issues.adaptor.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issue_id", "type", "current_state", "changelogs" })
public class Issue {

	@JsonProperty("issue_id")
	private String issueId;
	@JsonProperty("type")
	private String type;
	@JsonProperty("current_state")
	private String currentState;
	@JsonProperty("changelogs")
	private List<Changelog> changelogs;

}