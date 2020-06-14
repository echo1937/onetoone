package com.example.onetoone.repository;

import com.example.onetoone.entity.Student;
import com.example.onetoone.projection.StudentByCloseProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select new com.example.onetoone.projection.StudentByCloseProjection(s,p) from Student as s left join Phone as p on s.phone=p.id")
    Page<StudentByCloseProjection> findCustom(Pageable pageable);
}
