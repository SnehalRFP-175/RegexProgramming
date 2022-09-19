package com.UserRegistration.BridgeLabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //UC-1 Validate the First Name
    public static boolean firstName(String firstname)
    {

        String Name="^[A-Z][a-z]{2,}";

        Pattern p= Pattern.compile(Name);
        Matcher matcher=p.matcher(firstname);
        boolean result = matcher.matches();
        return result;
    }

    //UC2- Validate the Users Last NAme
    public boolean lastName(String lastName)
    {

        String Name="^[A-Z][a-z]{2,}";

        Pattern p= Pattern.compile(Name);
        Matcher matcher=p.matcher(lastName);

        boolean result = matcher.matches();
        return result;
    }


    // //UC-3 Validate the Email Address
    public boolean email_ID(String email)
    {

        String emailId = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$";

        Pattern p= Pattern.compile(emailId);
        Matcher matcher=p.matcher(email);

        boolean result = matcher.matches();
        return result;
    }

    //uc-4 Validates the Users Mobile Number

    public boolean mobileNum(String num)
    {

        String mobile="(91|0)?+[7-9]+[0-9]{9}";

        Pattern p=Pattern.compile(mobile);
        Matcher matcher=p.matcher(num);

        boolean result = matcher.matches();
        return result;
    }


    //UC8 Validates Password-Rule 4- Having Exactly One Special Character

    public boolean password(String pass)
    {

        String password= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&–_:;]).{8,}$";

        Pattern p=Pattern.compile(password);
        Matcher matcher=p.matcher(pass);

        boolean result = matcher.matches();
        return result;
    }

    public static void main(String a[]) {
        UserRegistration user = new UserRegistration();

        int ch = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Name \n2.LastName \n3.Email_Id \n4.Mobile Num \n5.Password \n6.Exit");
        System.out.println("Enter your choice");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter first name ");
                String firstName = sc.next();
                if (user.firstName(firstName))
                    System.out.println("Valid first name");
                else
                    System.out.println("Invalid first name");
                break;

            case 2:
                System.out.println("Enter Last Name ");
                String lastName = sc.next();
                if (user.lastName(lastName))
                    System.out.println("Valid Last name");
                else
                    System.out.println("Invalid Last name");
                break;

            case 3:
                System.out.println("Enter Email Id");
                String email = sc.next();
                if (user.email_ID(email))
                    System.out.println("Valid Mail Id");
                else
                    System.out.println("Invalid Mail Id");
                break;

            case 4:
                System.out.println("Enter Mobile Num");
                String mobilenum = sc.next();
                if (user.mobileNum(mobilenum))
                    System.out.println("Valid Mobile Number");
                else
                    System.out.println("Invalid Mobile Number");
                break;

            case 5:
                System.out.println("Enter Password ");
                String password = sc.next();
                if (user.mobileNum(password))
                    System.out.println("Valid Password");
                else
                    System.out.println("Invalid Password");
                break;
            default:
                break;

        }
    }
    }
