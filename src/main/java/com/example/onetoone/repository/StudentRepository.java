package com.example.onetoone.repository;

import com.example.onetoone.entity.Student;
import com.example.onetoone.projection.StudentByArgsCloseProjection;
import com.example.onetoone.projection.StudentByCloseProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select new com.example.onetoone.projection.StudentByCloseProjection(s,p) from Student as s left join Phone as p on s.phone=p.id")
    Page<StudentByCloseProjection> findCustom(Pageable pageable); // 性能差一些，获取s和p需要额外的两条SQL

    @Query("select new com.example.onetoone.projection.StudentByArgsCloseProjection(s.name,p.phoneNumber) from Student as s left join Phone as p on s.phone=p.id")
    Page<StudentByArgsCloseProjection> findCustomByArgs(Pageable pageable); // 性能更好，单条SQL完成
}
