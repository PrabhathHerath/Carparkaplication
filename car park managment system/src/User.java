import java.util.Scanner;
import java.util.ArrayList;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors



public class User {


    public static void main(String[] args) {
      //  String[] myNumbers = {"","",""," "};


        ArrayList<String> user = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        String Id;

        System.out.print("Enter Frist Name: ");
        String Fname = myObj.nextLine();

        System.out.print("Enter Last name: ");
        String Lname = myObj.nextLine();

        System.out.print("Enter Address: ");
        String Address = myObj.nextLine();

        System.out.print("Enter ID No:");
        Id = myObj.nextLine();


        user.add(Fname);
        user.add(Lname);
        user.add(Address);
        user.add(Id);





System.out.println(user);

        String[] myNumbers = {"","",""};
        Long [][] myNumbers1 = {{}};


        Scanner myObj = new Scanner(System.in);
        String Id;

        System.out.print("Enter name");
        String name = myObj.nextLine();
        // String input


        System.out.print("Enter ID No:");
        // Numerical input
        Id = myObj.nextLine();
        System.out.print("Enter Vehical Number:");
        String Vnumber= myObj.nextLine();

        myNumbers[0] = name ;
        myNumbers[1] =Id ;
        myNumbers[2] =Vnumber;

    }
}































