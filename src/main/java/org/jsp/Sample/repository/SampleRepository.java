package org.jsp.Sample.repository;

import org.jsp.Sample.dto.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Integer> {

}
