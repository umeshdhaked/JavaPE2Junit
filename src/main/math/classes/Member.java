package math.classes;

public class Member {

     String name;
     int age;
     float salary;


    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public float getSalary() {
        return salary;
    }
}
