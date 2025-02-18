package COLLECTION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + " " + age + "";
    }
}
public class StudentComparator{
      public static void main(String args[]){
  //   Comparator<Student>com=new Comparator<Student>() {
  //     public int  compare(Student i,Student j){
  //       if(i.age>j.age){
  //           return 1;
  //       }
  //       else{
  //           return -1;
  //       }  
  //     }
  //   };

    Comparator<Student>com=(Student i,Student j)->{
        if(i.age>j.age){
            return 1;
        }
        else{
            return -1;
        }  
      };
    
     List<Student> sd=new ArrayList<>();
     sd.add(new Student("navin", 8));
     sd.add(new Student("jeel", 18));
     sd.add(new Student("nitin", 38));
     sd.add(new Student("meet", 28));
     sd.add(new Student("vipul", 48));
    Collections.sort(sd,com);
    for (Student student : sd) {
      System.out.println(student);
      }
    }      
}

