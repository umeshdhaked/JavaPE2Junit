package com.company;
import math.classes.*;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


// palindrome
        System.out.println("// Palindrome");
        System.out.println(palindrome.palindrome("umemu")?"It is Palindrome":"Not Palindrome");
// power of 4
        System.out.println("// power of 4");
        System.out.println(powOfFour.checkPowOf4(256));
//EvenNum
        System.out.println("// check even number : ");
        System.out.println(EvenNumTest.isEven(8));

//members
        System.out.println("// Enter member detail");
        memberVar obj= new memberVar();
        obj.memberVariable();

        Member objMember = new Member();

        System.out.println(objMember.getName());
        System.out.println(objMember.getAge());
        System.out.println(objMember.getSalary());

// Student Grade ;
        System.out.println("// Students average grad : ");
        System.out.println("Student Grade:\n Enter number of students : ");

        int num=sc.nextInt();
        System.out.println("Enter grades : ");
        int[] grades=new int[num];
        for(int i=0;i<num;i++){
            grades[i]= sc.nextInt();
        }


        studentgrade obj1 = new studentgrade();
        System.out.println( "Average : " +obj1.average(num, grades) );
        System.out.println("max: "+ obj1.max(grades));
        System.out.println("min: "+obj1.min(grades));


//factorial

        System.out.println("// Factorial of : ");
        int n= sc.nextInt();
        int ans =factorial.fact(n);
        if(ans==0)
            System.out.println("out of range");
        else
        System.out.println("Factorial is : "+ans);




// user class

        System.out.println("// User Detail : ");

        String fName = "Umesh";
        String lName = "Dhaked";


        System.out.println("age : ");
        int age=0;
        while(age<=0 || age>100 ){
            age=sc.nextInt();
        }
        System.out.println("salary : ");
        int salary = sc.nextInt();

        user first=new user(fName,lName,age,salary);

        System.out.println("is Valid Age= "+first.isValidAge());
        System.out.println("full name "+first.getFullName());

    }
}
