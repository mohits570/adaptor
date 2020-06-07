package com.issues.adaptor.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"project_id"
})
public class GetIssuesRequest {

@JsonProperty("project_id")
private String projectId;

}
