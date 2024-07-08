package org.example.model;

public class Teacher extends User{
    private Integer id;
    public Teacher(String name, String secondName, Integer age, Integer id) {
        super(name, secondName, age);
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Учитель: ID - '" + id + '\'' +
                ", Имя - '" + getName() + '\'' +
                ", Фамилия - '" + getSecondName() + '\'' +
                ", Год рождения - " + getAge();
    }
}