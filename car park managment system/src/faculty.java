

import java.util.Scanner;

public class faculty {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        //  facultypark pa=new facultypark();


        Scanner myObj = new Scanner(System.in);

        String[] User={"","",""};


        int c = 0;
        int choice;
        int category;

        int[] Fot = {0, 0, 0};
        int[] Fots = {20, 20, 20};


        int[] Fop = {0, 0, 0};
        int[] Fops = {20, 20, 20};

        int[] Fos = {0, 0, 0};
        int[] Foss = {20, 20, 20};

        int[] Fom = {0, 0, 0};
        int[] Foms = {20, 20, 20};


        int[] FoA ={0,0,0};
        int[] FoAs={0,0,0};

        // int car=0,bike=0,van=0;
        while (true) {
            System.out.println("Press 1 to enter Faculty of Technology");
            System.out.println("Press 2 to enter Faculty of Physics ");
            System.out.println("Press 3 to enter Faculty of Science");
            System.out.println("Press 4 to enter Faculty of management");

            System.out.println("Press 5 to enter Faculty of Art & Low ");
            System.out.println("Press 5 to enter Faculty of Low ");
            System.out.println("Press 6 to enter Faculty of Art")


            choice = sc.nextInt();

            //#####################################################

            if (choice == 1) {
                System.out.println("Faculty of Technology");
                System.out.println("Press 1 to enter standard");
                System.out.println("Press 2 to enter Handicapped");
                System.out.println("Press 3 to enter Long vehicals");


                System.out.print("standard Space:  ");
                System.out.println(Fots[0]);
                System.out.print(" Handicapped Space:  ");
                System.out.println(Fots[1]);
                System.out.print("  Long vehicals Space:  ");
                System.out.println(Fots[2]);

                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(Fot[0]);
                System.out.print("car Space:  ");
                System.out.println(Fot[1]);
                System.out.print("van Space:  ");
                System.out.println(Fot[2])
                category = sc.nextInt();

                //#####################################################

                if (category == 1) {
                    c = Fot[0] + 1;
                    Fot[0] = c;
                    Fots[0] = Fots[0] - 1;



                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;














                    System.out.print("standard :");
                    System.out.print("car :");

                    System.out.print(Fot[0]);
                    System.out.print("   ");
                    System.out.print(Fots[0]);



                    System.out.print("  Handicapped :");
                    System.out.print(" van :");
                    System.out.print(Fot[1]);
                    System.out.print("   ");
                    System.out.print(Fots[1]);


                    System.out.print("  Long vehicals :");
                    System.out.print(" Bick :");
                    System.out.print(Fot[2]);
                    System.out.print("   ");
                    System.out.println(Fots[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);



                }
                //#####################################################
                else if (category == 2) {

                    Fot[1] = Fot[1] + 1;
                    Fots[1] = Fots[1] - 1;


                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;



















                    System.out.print("standard :");

                    System.out.print("car :");

                    System.out.print(Fot[0]);
                    System.out.print("   ");
                    System.out.print(Fots[0]);



                    System.out.print(" Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fot[1]);
                    System.out.print("   ");
                    System.out.print(Fots[1]);


                    System.out.print("  Long vehicals :");

                    System.out.print(" Bick :");

                    System.out.print(Fot[2]);
                    System.out.print("   ");
                    System.out.println(Fots[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);





                }

                //#####################################################
                else if (category == 3) {

                    Fot[2] = Fot[2] + 1;
                    Fots[2] = Fots[2] - 1;






                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;























                    System.out.print("standard :");

                    System.out.print("car :");

                    System.out.print(Fot[0]);
                    System.out.print("   ");
                    System.out.print(Fots[0]);



                    System.out.print("  Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fot[1]);
                    System.out.print("   ");
                    System.out.print(Fots[1]);

                    System.out.print("  Long vehicals :");

                    System.out.print(" Bick :");

                    System.out.print(Fot[2]);
                    System.out.print("   ");
                    System.out.println(Fots[2]);




                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);




                }

            }


            //#####################################################

            else if (choice == 2) {
                System.out.println("Faculty of Physics");

                System.out.println("Press 1 to enter standard");
                System.out.println("Press 2 to enter Handicapped");
                System.out.println("Press 3 to enter Long vehicals");


                System.out.print("standard Space:  ");
                System.out.println(Fops[0]);
                System.out.print("Handicapped Space:  ");
                System.out.println(Fops[1]);
                System.out.print("Long vehicals Space:  ");
                System.out.println(Fops[2]);

                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(Fop[0]);
                System.out.print("car Space:  ");
                System.out.println(Fop[1]);
                System.out.print("van Space:  ");
                System.out.println(Fop[2]);

                category = sc.nextInt();

                //#####################################################

                if (category == 1) {
                    c = Fop[0] + 1;
                    Fop[0] = c;
                    Fots[0] = Fop[0] - 1;



                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;






                    System.out.print("standard :");

                    System.out.print("car :");

                    System.out.print(Fop[0]);
                    System.out.print("   ");
                    System.out.print(Fops[0]);



                    System.out.print("  Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fop[1]);
                    System.out.print("   ");
                    System.out.print(Fops[1]);


                    System.out.print("  Long vehicals :");

                    System.out.print(" Bick :");

                    System.out.print(Fop[2]);
                    System.out.print("   ");
                    System.out.println(Fops[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);



                }
                //#####################################################
                else if (category == 2) {

                    Fop[1] = Fop[1] + 1;
                    Fops[1] = Fops[1] - 1;



                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    System.out.print("standard :");

                    System.out.print("car :");

                    System.out.print(Fop[0]);
                    System.out.print("   ");
                    System.out.print(Fops[0]);



                    System.out.print("  Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fop[1]);
                    System.out.print("   ");
                    System.out.print(Fops[1]);


                    System.out.print("  Long vehicals :");

                    System.out.print(" Bick :");

                    System.out.print(Fop[2]);
                    System.out.print("   ");
                    System.out.println(Fops[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);




                }

                //#####################################################
                else if (category == 3) {

                    Fop[2] = Fop[2] + 1;
                    Fops[2] = Fops[2] - 1;


                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;


                    System.out.print("standard :");

                    System.out.print("car :");

                    System.out.print(Fop[0]);
                    System.out.print("   ");
                    System.out.print(Fops[0]);


                    System.out.print(" Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fop[1]);
                    System.out.print("   ");
                    System.out.print(Fops[1]);


                    System.out.print(" Long vehicals :");

                    System.out.print(" Bick :");

                    System.out.print(Fop[2]);
                    System.out.print("   ");
                    System.out.println(Fops[2]);

                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);


                }

            } else if (3 == choice) {

                System.out.println("Faculty of Physics");
                System.out.println("Press 1 to enter standard");
                System.out.println("Press 2 to enter Handicapped");
                System.out.println("Press 3 to enter Long vehicals");


                System.out.print("standard Space:  ");
                System.out.println(Foss[0]);
                System.out.print("Handicapped Space:  ");
                System.out.println(Foss[1]);
                System.out.print("Long vehicals Space:  ");
                System.out.println(Foss[2]);

                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(Fos[0]);
                System.out.print("car Space:  ");
                System.out.println(Fos[1]);
                System.out.print("van Space:  ");
                System.out.println(Fos[2]);

                category = sc.nextInt();

                //#####################################################

                if (category == 1) {
                    Fos[0] = Fos[0] + 1;



                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    Foss[0] = Fos[0] - 1;
                    System.out.print("standard :");

                    Foss[0] = Fos[0] - 1;
                    System.out.print("car :");

                    System.out.print(Fos[0]);
                    System.out.print("   ");
                    System.out.print(Foss[0]);



                    System.out.print("Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fos[1]);
                    System.out.print("   ");
                    System.out.print(Foss[1]);


                    System.out.print("Long vehicals :");

                    System.out.print(" Bick :");

                    System.out.print(Fos[2]);
                    System.out.print("   ");
                    System.out.println(Foss[2]);

                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);





                } else if (category == 2) {

                    Fos[1] = Fos[1] + 1;
                    Foss[1] = Foss[1] - 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;





                    System.out.print("standard :");

                    System.out.print("car :");

                    System.out.print(Fos[0]);
                    System.out.print("   ");
                    System.out.print(Foss[0]);



                    System.out.print("Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fos[1]);
                    System.out.print("   ");
                    System.out.print(Foss[1]);


                    System.out.print("Long vehicals :");

                    System.out.print(" Bick :");

                    System.out.print(Fos[2]);
                    System.out.print("   ");
                    System.out.println(Foss[2]);




                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);





                } else if (category == 3) {

                    Fos[2] = Fos[2] + 1;
                    Foss[2] = Foss[2] - 1;



                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    System.out.print("standard :");

                    System.out.print("car :");

                    System.out.print(Fos[0]);
                    System.out.print("   ");
                    System.out.print(Foss[0]);



                    System.out.print("Handicapped :");

                    System.out.print(" van :");

                    System.out.print(Fos[1]);
                    System.out.print("   ");
                    System.out.print(Foss[1]);


                    System.out.print("Long vehicals :");
             System.out.print(" Bick :");

                    System.out.print(Fos[2]);
                    System.out.print("   ");
                    System.out.println(Foss[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);





                }
            }else if (4 == choice) {

                System.out.println("Faculty of Management");

                System.out.println("Press 1 to enter standard");
                System.out.println("Press 2 to enter Handicapped");
                System.out.println("Press 3 to enter Long vehicals");


                System.out.print("standard Space:  ");
                System.out.println(Foms[0]);
                System.out.print("Handicapped Space:  ");
                System.out.println(Foms[1]);
                System.out.print("Long vehicals Space:  ");
                System.out.println(Foms[2]);

                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(Fom[0]);
                System.out.print("car Space:  ");
                System.out.println(Fom[1]);
                System.out.print("van Space:  ");
                System.out.println(Fom[2]);

                category = sc.nextInt();

                //#####################################################

                if (category == 1) {
                    Fom [0] = Fom [0] + 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    Foms[0] = Fom[0] - 1;
                    System.out.print("standard :");

                    Foms[0] = Fom[0] - 1;
                    System.out.print("car :");
 
                    System.out.print(Fos[0]);
                    System.out.print("   ");
                    System.out.print(Foms[0]);


 
                    System.out.print("Handicapped :");

                    System.out.print(" van :");
 
                    System.out.print(Fom[1]);
                    System.out.print("   ");
                    System.out.print(Foms[1]);

 
                    System.out.print("Long vehicals :");

                    System.out.print(" Bick :");
 
                    System.out.print(Fom[2]);
                    System.out.print("   ");
                    System.out.println(Foms[2]);

 

                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);






 
                } else if (category == 2) {

                    Fom[1] = Fom[1] + 1;
                    Foms[1] = Foms[1] - 1;

 



                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;





                    System.out.print("standard :");

                    System.out.print("car :");
 
                    System.out.print(Fom[0]);
                    System.out.print("   ");
                    System.out.print(Foms[0]);


                    System.out.print("Handicapped :");

                    System.out.print(" van :");
 
                    System.out.print(Fom[1]);
                    System.out.print("   ");
                    System.out.print(Foms[1]);

 
                    System.out.print("Long vehicals :");

                    System.out.print(" Bick :");
 
                    System.out.print(Fom[2]);
                    System.out.print("   ");
                    System.out.println(Foms[2]);

 

                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);





 
                } else if (category == 3) {

                    Fom[2] = Fom[2] + 1;
                    Foms[2] = Foms[2] - 1;

 



                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    System.out.print("standard :");

                    System.out.print("car :");
 
                    System.out.print(Fom[0]);
                    System.out.print("   ");
                    System.out.print(Foms[0]);


 
                    System.out.print("Handicapped :");

                    System.out.print(" van :");
 
                    System.out.print(Fom[1]);
                    System.out.print("   ");
                    System.out.print(Foms[1]);

 
                    System.out.print("Long vehicals :");

                    System.out.print(" Bick :");
 
                    System.out.print(Fom[2]);
                    System.out.print("   ");
                    System.out.println(Foms[2]);


 


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);



                }
            }

            else if (5 == choice) {

                System.out.println("Faculty of Management");
                System.out.println("Press 1 to enter standard");
                System.out.println("Press 2 to enter Handicapped");
                System.out.println("Press 3 to enter Long vehicals");


                System.out.print("standard Space:  ");
                System.out.println(FoAs[0]);
                System.out.print("Handicapped Space:  ");
                System.out.println(FoAs[1]);
                System.out.print("Long vehicals Space:  ");
                System.out.println(FoAs[2]);
                category = sc.nextInt();

                //#####################################################

                if (category == 1) {
                    FoA [0] = FoA [0] + 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    Foms[0] = FoA[0] - 1;
                    System.out.print("standard :");
                    System.out.print(FoA[0]);
                    System.out.print("   ");
                    System.out.print(FoAs[0]);


                    System.out.print("Handicapped :");
                    System.out.print(FoA[1]);
                    System.out.print("   ");
                    System.out.print(FoAs[1]);

                    System.out.print("Long vehicals :");
                    System.out.print(FoA[2]);
                    System.out.print("   ");
                    System.out.println(FoAs[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);





                } else if (category == 2) {

                    FoA[1] = FoA[1] + 1;
                    FoAs[1] = FoAs[1] - 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;





                    System.out.print("standard :");
                    System.out.print(FoA[0]);
                    System.out.print("   ");
                    System.out.print(FoAs[0]);


                    System.out.print("Handicapped :");
                    System.out.print(FoA[1]);
                    System.out.print("   ");
                    System.out.print(FoAs[1]);

                    System.out.print("Long vehicals :");
                    System.out.print(Fom[2]);
                    System.out.print("   ");
                    System.out.println(Foms[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);




                } else if (category == 3) {

                    FoA[2] = FoA[2] + 1;
                    FoAs[2] = FoAs[2] - 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    System.out.print("standard :");
                    System.out.print(FoA[0]);
                    System.out.print("   ");
                    System.out.print(FoAs[0]);


                    System.out.print("Handicapped :");
                    System.out.print(FoA[1]);
                    System.out.print("   ");
                    System.out.print(Foms[1]);

                    System.out.print("Long vehicals :");
                    System.out.print(FoA[2]);
                    System.out.print("   ");
                    System.out.println(FoAs[2]);




                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);



                }
            }

            else if (5 == choice) {

                System.out.println("Faculty of lAW & Art");
                System.out.println("Press 1 to enter standard");
                System.out.println("Press 2 to enter Handicapped");
                System.out.println("Press 3 to enter Long vehicals");


                System.out.print("standard Space:  ");
                System.out.println(FoAs[0]);
                System.out.print("Handicapped Space:  ");
                System.out.println(FoAs[1]);
                System.out.print("Long vehicals Space:  ");
                System.out.println(FoAs[2]);
                category = sc.nextInt();

                //#####################################################

                if (category == 1) {
                    FoA [0] = FoA [0] + 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    Foms[0] = FoA[0] - 1;
                    System.out.print("standard :");
                    System.out.print(FoA[0]);
                    System.out.print("   ");
                    System.out.print(FoAs[0]);


                    System.out.print("Handicapped :");
                    System.out.print(FoA[1]);
                    System.out.print("   ");
                    System.out.print(FoAs[1]);

                    System.out.print("Long vehicals :");
                    System.out.print(FoA[2]);
                    System.out.print("   ");
                    System.out.println(FoAs[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);





                } else if (category == 2) {

                    FoA[1] = FoA[1] + 1;
                    FoAs[1] = FoAs[1] - 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;





                    System.out.print("standard :");
                    System.out.print(FoA[0]);
                    System.out.print("   ");
                    System.out.print(FoAs[0]);


                    System.out.print("Handicapped :");
                    System.out.print(FoA[1]);
                    System.out.print("   ");
                    System.out.print(FoAs[1]);

                    System.out.print("Long vehicals :");
                    System.out.print(Fom[2]);
                    System.out.print("   ");
                    System.out.println(Foms[2]);


                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);




                } else if (category == 3) {

                    FoA[2] = FoA[2] + 1;
                    FoAs[2] = FoAs[2] - 1;




                    System.out.print("Enter Frist Name: ");
                    String Fname = myObj.nextLine();
                    System.out.print("Enter  ID: ");
                    String ID = myObj.nextLine();
                    System.out.print("Enter Vehical Number: ");
                    String Vno = myObj.nextLine();

                    User[0]=Fname;
                    User[1]=ID;
                    User[2]=Vno;




                    System.out.print("standard :");
                    System.out.print(FoA[0]);
                    System.out.print("   ");
                    System.out.print(FoAs[0]);


                    System.out.print("Handicapped :");
                    System.out.print(FoA[1]);
                    System.out.print("   ");
                    System.out.print(Foms[1]);

                    System.out.print("Long vehicals :");
                    System.out.print(FoA[2]);
                    System.out.print("   ");
                    System.out.println(FoAs[2]);




                    System.out.println(User[0]);  // User id name v no print
                    System.out.println(User[1]);
                    System.out.println(User[2]);




 
                }
            }









































































































        }
    }


}


