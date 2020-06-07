package com.issues.adaptor.response;

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
@JsonPropertyOrder({ "changed_on", "from_state", "to_state" })
public class Changelog {

	@JsonProperty("changed_on")
	private String changedOn;
	@JsonProperty("from_state")
	private String fromState;
	@JsonProperty("to_state")
	private String toState;

}