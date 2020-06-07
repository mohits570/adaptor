package com.issues.adaptor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.issues.adaptor.entity.ChangeLogEntity;

@Repository
public interface ChangeLogRepository extends JpaRepository<ChangeLogEntity, String> {

	@Query(value = "SELECT cl from ChangeLogEntity cl WHERE cl.issue.projectId= :projectId AND cl.issue.type IN (:types) AND  cl.toState IN (:states)  AND cl.yearWeek BETWEEN :fromYearWeek AND :toYearWeek ")
	List<ChangeLogEntity> getChangeLogsByProjectIdDateRangeTypesAndStates(@Param("projectId") String projectId,
			@Param("fromYearWeek") Integer fromYearWeek, @Param("toYearWeek") Integer toYearWeek,
			@Param("types") List<String> types, @Param("states") List<String> states);
}
