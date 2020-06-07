package com.issues.adaptor.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "issues")
public class IssueEntity {
	@Id
	@Column(name = "issue_id")
	private String issueId;
	private String projectId;
	private String type;
	private String currentState;
	@OneToMany(mappedBy = "issue", fetch = FetchType.LAZY)
	private List<ChangeLogEntity> changeLogs;
}
