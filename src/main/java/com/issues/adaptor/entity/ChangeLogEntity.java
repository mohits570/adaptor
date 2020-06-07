package com.issues.adaptor.entity;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "change_logs")
public class ChangeLogEntity {
	@Id
	private String changeLogId;
	@ManyToOne
	@JoinColumn(name = "issue_id", nullable = false)
	private IssueEntity issue;
	private ZonedDateTime changedOn;
	private String fromState;
	private String toState;
	private Integer yearWeek;
}
