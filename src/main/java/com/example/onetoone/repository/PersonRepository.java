package com.example.onetoone.repository;

import com.example.onetoone.entity.Person;
import com.example.onetoone.projection.PersonByCloseProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Page<PersonByCloseProjection> findAllByFirstName(String firstName, Pageable pageable);
}
