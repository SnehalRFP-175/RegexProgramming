package com.Regex.BridgeLabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //UC-1 Validate the First Name
    public void Firstname()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String n = sc.next();
        String Name="^[A-Z][a-z]{2,}";

        Pattern p= Pattern.compile(Name);
        Matcher matcher=p.matcher(n);

        if(matcher.find())
            System.out.println("Valid Name.....");
        else
            System.out.println("Invalid Name.....");
    }

    //UC2- Validate the Users Last NAme
    public void lastName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String n = sc.next();
        String Name="^[A-Z][a-z]{2,}";

        Pattern p= Pattern.compile(Name);
        Matcher matcher=p.matcher(n);

        if(matcher.find())
            System.out.println("Valid Name.....");
        else
            System.out.println("Invalid Name.....");
    }


    // //UC-3 Validate the Email Address
    public void email_ID()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email: ");
        String email = sc.next();
        String emailId = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]";

        Pattern p= Pattern.compile(emailId);
        Matcher matcher=p.matcher(email);

        if(matcher.find())
            System.out.println("Valid Email Id.....");
        else
            System.out.println("Invalid Email Id.....");
    }

    //uc-4 Validates the Users Mobile Number

    public void mobileNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mobile Num: ");
        String num = sc.next();
        String mobile="(91|0)?+[7-9]+[0-9]{9}";

        Pattern p=Pattern.compile(mobile);
        Matcher matcher=p.matcher(num);

        if(matcher.find())
            System.out.println("Valid Number.....");
        else
            System.out.println("Invalid Number.....");
    }



    public static void main(String a[]) {

        UserRegistration user = new UserRegistration();

        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Name \n2.LastName \n3.Email_Id \n4.Mobile Num \n5.Exit");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch(ch) {
            case 1:
                user.Firstname();
                break;
            case 2:
                user.lastName();
                break;
            case 3:
                user.email_ID();
                break;
            case 4:
                user.mobileNum();
                break;
            case 5:
                return;
            default:
                System.out.println("Enter Valid Choice...!");
                break;
        }

        }
}
