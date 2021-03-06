package com.issues.adaptor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.issues.adaptor.entity.IssueEntity;

@Repository
public interface IssueRepository extends JpaRepository<IssueEntity, String> {
	
	@Query(value = "SELECT i from IssueEntity i WHERE i.projectId= :projectId AND i.type IN (:types) AND  i.changeLogs.toState IN (:states)  AND i.changeLogs.yearWeek BETWEEN :fromYearWeek AND :toYearWeek ")
	List<IssueEntity> getIssuesByProjectIdDateRangeTypesAndStates(@Param("projectId") String projectId,
			@Param("fromYearWeek") Integer fromYearWeek, @Param("toYearWeek") Integer toYearWeek,
			@Param("types") List<String> types, @Param("states") List<String> states);
}
