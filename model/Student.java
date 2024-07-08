package org.example.model;

public class Student extends User{
    private Integer id;

    public Student(String name, String secondName, Integer age, Integer id) {
        super(name, secondName, age);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Студент: ID - '" + id + '\'' +
                ", Имя - '" + getName() + '\'' +
                ", Фамилия - '" + getSecondName() + '\'' +
                ", Год рождения - " + getAge();
    }
}