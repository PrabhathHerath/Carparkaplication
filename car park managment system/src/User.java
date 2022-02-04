import java.util.Scanner;
import java.util.ArrayList;


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

    }
}































