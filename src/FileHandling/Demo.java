package FileHandling;

import java.util.Scanner;

import java.sql.SQLOutput;

public class Demo {

    public static void main(String args[]){
        System.out.println("--Main Menu--");
        System.out.println("1.Student Operations");
        System.out.println("2.Mark Operations");
        System.out.println("0.Exit");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");

        int value = input.nextInt();

        if(value==1){
            System.out.println("--Student Operations--");
            System.out.println("1.Add a Student");
            System.out.println("2.View a Student");
            System.out.println("3.Update a Student");
            System.out.println("4.Delete a Student");
            System.out.println("5.Main Menu");
            System.out.println("0.Exit");

            System.out.println("Enter your choice:");
            int stu = input.nextInt();

            if(stu==1){
                System.out.println("Enter the student reg no:");
                String RegNo = input.nextLine();

                System.out.println("Enter the student Name:");
                String Name = input.nextLine();

                System.out.println("Enter the student DOB:");
                String DOB = input.nextLine();

                System.out.println("Enter the student Email:");
                String Email = input.nextLine();

                System.out.println("Enter the student contact no:");
                String Contact = input.nextLine();

            if(stu==2){
                System.out.println("Enter the student reg no:");
                String num = input.nextLine();
            }


            if(stu==3){
                System.out.println("Enter the student reg no:");
                String num = input.nextLine();

                System.out.println("--Student Update--");
                System.out.println("1.Update name");
                System.out.println("2.Update DOB");
                System.out.println("3.Update Contact num");
                System.out.println("4.Student operations");
                System.out.println("5.Main Menu");
                System.out.println("0.Exit");


                }


            if(stu==4){
                System.out.println("Enter the student reg no:");
                String num = input.nextLine();
                }

            }


        }

        if(value==2){
            System.out.println("--MArks Operations--");
            System.out.println("1.Add Marks");
            System.out.println("2.Display All Student Marks");
            System.out.println("3.Display Individual Student Marks");
            System.out.println("4.Main Menu");
            System.out.println("0.Exit");

            int mark = input.nextInt();

            if(mark==1){
                System.out.println("Enter your Registration Number:");
                String RegNo = input.nextLine();
            }

            if(mark==2){

            }

            if(mark==3){
                System.out.println("Enter your Registration Number:");
                String RegNo = input.nextLine();

            }
        }



    }


}
