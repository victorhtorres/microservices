package com.infybuzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infybuzz.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
	
}
