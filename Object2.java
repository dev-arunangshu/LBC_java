// This program defines a class `student` with private members `name` and `marks`.
// It includes a constructor to initialize these members 
// and a method `display()` to print the student's
import java.util.Scanner;
class student{
    String name;
    int marks;
    // Constructor to initialize the name and marks of the student
    student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    // Method to display the name and marks of the student
    void display(){
        System.out.println("The name of the student is: "+name);
        System.out.println("The marks of the student is: "+marks);
    }
}
class Object2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the name and marks of the student: ");
        String yourName=sc.nextLine();
        int score=sc.nextInt();
        // Create an instance of the student class using the user input and display the information
        student s1=new student(yourName, score);
        // Call the display method to show the student's information
        s1.display();
        sc.close();
    }
}