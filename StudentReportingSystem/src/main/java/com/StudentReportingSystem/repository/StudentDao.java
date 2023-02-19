package com.StudentReportingSystem.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.StudentReportingSystem.model.Student;

@Repository
public interface StudentDao extends ElasticsearchRepository<Student, String> {

}
