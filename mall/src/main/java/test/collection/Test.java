package test.collection;

import java.util.Comparator;
import java.util.HashMap;


public class Test implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()>o2.getAge())return 1;
        if(o1.getAge()<o2.getAge())return -1;
        return 0;
    }
    public static void main(String[] args) {
//        TreeSet<Student> treeSet = new TreeSet<>(new Test());
//        treeSet.add(new Student("tome",30));
//        treeSet.add(new Student("lili",20));
//        for (Student student : treeSet) {
//            System.out.println(student);
//        }
        HashMap map=new HashMap();
        map.put(null,"1");
        map.put("1s",null);
        map.put("2s",null);
        System.out.println(map);
    }
}
