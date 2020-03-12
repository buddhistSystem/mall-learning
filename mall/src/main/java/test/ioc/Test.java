package test.ioc;


import test.ioc.entity.Student;
import test.ioc.iocfactory.impl.MyClassPathXmlApplicationContext;
import test.ioc.service.StudentService;

/**
 * @Author: Administrator
 * @Date: 2019/11/5 0005 15:06
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("mybean.xml");
        StudentService studentService = (StudentService) context.getBean("StudentService");
        Student student = studentService.getStudent();
        System.out.println(student);


    }

}
