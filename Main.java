package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("my name is java");

//
//        //new string
//        String lalit=new String("lalit prakash fatehpuriya");
//        System.out.println(lalit);
//
//
//        user of Scanner(user input)
//      //  import java.util.Scanner;
//        System.out.println("Enter first number ");
//        Scanner a= new Scanner(System.in);
//        int b=a.nextInt();
//        System.out.println("Enter second number");
//        Scanner c= new Scanner(System.in);
//        int d=c.nextInt();
//        int sum;
//        sum=b+d;
//        System.out.println("sum of two numers   " + sum );

        //Make a jarvis with help of string and Scanner class
        System.out.println("hello good morng");
        System.out.println("you want to play a game");
        System.out.println("Give your answer b/w Yes or no");
        Scanner Yes=new Scanner(System.in);
        String a=Yes.nextLine();
        System.out.println(a);
        if(a.equalsIgnoreCase("Yes")){
            System.out.println("what is your name ");
            Scanner sc =new Scanner(System.in);
            String d= sc.nextLine();
            System.out.println("your name is  " + d);

        }else {
            System.out.println("Thankyou");

        }

    }
}
