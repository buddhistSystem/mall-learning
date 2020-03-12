package test.ioc.service;


import test.ioc.entity.Student;

public class StudentService {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
