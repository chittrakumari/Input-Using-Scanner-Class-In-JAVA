/*
An Application to demonstrate use of Scanner class.
Create an application to accept firstname, rollNumber, percentage,
section, year, course from user. And display the output in the below format.
Output
First Name : Vaibhav
rollNUmber : 81
Percentage : 66.31
Section : G
Year : 2
Course : B.Tech CSE */

import java.util.Scanner;
public class assignmentscanner
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
                System.out.println("Enter your firstname");
                String name=obj.nextLine();
                System.out.println("Enter your Roll number");
                short rollNumber=obj.nextShort();
                System.out.println("Enter your percentage");
                double percentage=obj.nextDouble();
                System.out.println("Enter your section");
                String section=obj.next();
                System.out.println("Enter the year which you are studying in terms of cardinal numbers");
                Byte year=obj.nextByte();
                obj.nextLine();
                System.out.println("Enter your course");
                String course=obj.nextLine();
                obj.close();
                System.out.println("First Name : "+name);
                System.out.println("rollNumber : "+rollNumber);
                System.out.println("Section : "+section);
                System.out.println("Percentage : "+percentage);
                System.out.println("Year : "+year);
                System.out.println("Course : "+course);
    }
}
