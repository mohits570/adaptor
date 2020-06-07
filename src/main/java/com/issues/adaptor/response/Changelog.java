package com.issues.adaptor.response;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd h:mma z")
	private ZonedDateTime changedOn;
	@JsonProperty("from_state")
	private String fromState;
	@JsonProperty("to_state")
	private String toState;

}