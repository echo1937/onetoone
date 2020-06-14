package com.example.onetoone.controller;

import com.example.onetoone.projection.PersonByCloseProjection;
import com.example.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("all")
    public Object getPersonAll() {
        return personRepository.findAll();
    }

    @GetMapping("personInfoOne")
    public Object getPersonInfo(@PageableDefault Pageable pageable) {
        return personRepository.findAllByFirstName("xiao", pageable);
    }

    @GetMapping("personInfoTwo")
    public Object getPersonInfoTwo(@PageableDefault Pageable pageable) {
        Page<PersonByCloseProjection> all = personRepository.findAllByFirstName("xiao", pageable);
        // 利用 <U> Page<U> map(Function<? super T, ? extends U> converter);
        return all.map(
                personByCloseProjection -> {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("firstName", personByCloseProjection.getFirstName());
                    map.put("lastName", personByCloseProjection.getLastName());
                    map.put("state", personByCloseProjection.getAddress().getState());
                    map.put("city", personByCloseProjection.getAddress().getCity());
                    map.put("street", personByCloseProjection.getAddress().getStreet());
                    map.put("zipCode", personByCloseProjection.getAddress().getZipCode());
                    return map;
                }
        );
    }

}
