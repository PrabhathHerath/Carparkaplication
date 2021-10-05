import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class User {


    public static void main(String[] args) {
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































