package COLLECTION;
import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;

class Student1 implements Comparable<Student1>{
    String name;
    int age;
    
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + " " + age + "";
    }

    @Override
    public int compareTo(Student1 that) {
      if(this.age>that.age){
        return 1;
    }
    else{
        return -1;
    }  
    }
}
public class StudentComparable{
  public static void main(String args[]){
    
     List<Student1>sd=new ArrayList<>();
     sd.add(new Student1("navin", 8));
     sd.add(new Student1("jeel", 18));
     sd.add(new Student1("nitin", 38));
     sd.add(new Student1("meet", 28));
     sd.add(new Student1("vipul", 48));
    Collections.sort(sd);
    for (Student1 student1 : sd) {
      System.out.println(student1);
      }
    }      
}

