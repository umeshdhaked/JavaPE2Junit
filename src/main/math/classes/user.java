package math.classes;

public class user {
    String firstName;
    String lastName;
    int age;
    int salary;

    public user(String firstName, String lastName, int age, int salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;

    }

    public boolean isValidAge(){
        if (age<60 && age>18)
            return true;
        else
            return false;

    }

    public String getFullName(){
        return firstName+" "+lastName;

    }





}
