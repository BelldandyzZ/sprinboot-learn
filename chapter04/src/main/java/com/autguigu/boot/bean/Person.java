package com.autguigu.boot.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Component
@ConfigurationProperties(prefix = "person")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    private String username;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interfaces;
    private List<String> animal;
    private Map<String,Object> score;
    private Set<Double> salaries;
    private Map<String,List<Pet>> allPets;
}
