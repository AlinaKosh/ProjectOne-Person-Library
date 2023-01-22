package ru.project.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "Name should be empty")
    @Size(min = 3, max = 30, message = "Name should be between 3 and 30")
    private String name;
    @NotEmpty(message = "Year of birth should be empty")
    @Min(value = 1900, message = "Year of birth must be indicated")
    private int yearOfBirth;

    public Person(int id, String name, int year_of_birth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = year_of_birth;
    }
    public Person() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
