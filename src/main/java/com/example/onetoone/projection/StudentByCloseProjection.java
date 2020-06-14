package com.example.onetoone.projection;

import com.example.onetoone.entity.Phone;
import com.example.onetoone.entity.Student;
import lombok.Data;

@Data
public class StudentByCloseProjection {

    private String name;
    private String phone;

    public StudentByCloseProjection(Student student, Phone phone) {
        this.name = student.getName();
        this.phone = phone.getPhoneNumber();
    }

}
