package org.example.service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    List<User> listUser;

    public UserService() {
        this.listUser = new ArrayList<>();
    }
    @Override
    public User create(User user) {
        if (user instanceof Student){
            int id = maxStudentId();
            listUser.add(new Student(user.getName(), user.getSecondName(), user.getAge(), id));
        } else {
            int id = maxTeacherId();
            listUser.add(new Teacher(user.getName(), user.getSecondName(), user.getAge(), id));
        }

        return listUser.get(listUser.size() - 1);
    }

    private int maxTeacherId() {
        for (int i = listUser.size() - 1; i > -1 ; i--) {
            if (listUser.get(i) instanceof Student){
                return i + 1;
            }
        }
        return 1;
    }

    private int maxStudentId() {
        for (int i = listUser.size() - 1; i > -1 ; i--) {
            if (listUser.get(i) instanceof Teacher){
                return i + 1;
            }
        }
        return 1;
    }

    @Override
    public List<User> read() {
        return listUser;
    }
}