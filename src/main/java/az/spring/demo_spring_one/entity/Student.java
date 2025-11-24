package az.spring.demo_spring_one.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stundent_id")
    private Long id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_surname")
    private String surname;

    @Column(name = "student_age")
    private Integer age;

}