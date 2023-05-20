package org.jsp.Sample.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Component
public class Sample {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	long mobile;
	String name;
}
