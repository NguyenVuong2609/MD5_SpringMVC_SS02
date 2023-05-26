package rikkei.academy.service;

import rikkei.academy.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    public static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1L, "Chuan", "Chuan@gmail.com", "Nam Dinh"));
        studentList.add(new Student(2L, "Thu", "Thu@gmail.com", "Yen Bai"));
        studentList.add(new Student(3L, "Ha", "Ha@gmail.com", "Phu Tho"));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student findById(Long id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        if (findById(student.getId()) != null) {
            int index = studentList.indexOf(student);
            studentList.set(index, student);
        } else {
            studentList.add(student);
        }
    }

    @Override
    public void deleteById(Long id) {
        studentList.remove(findById(id));
    }
}
