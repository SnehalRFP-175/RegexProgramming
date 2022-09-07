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


    public static void main(String a[]) {

        UserRegistration user = new UserRegistration();
        int ch = 0;

        user.Firstname();
    }
}
