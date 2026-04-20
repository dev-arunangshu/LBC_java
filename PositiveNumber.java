// finding if a number is positive
import java.util.Scanner;
public class PositiveNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("Enter the second number");
    int num2=sc.nextInt();

    if (num1>=0){
        System.out.println(num1+" is a positive number");
    }else{
        System.out.println(num2 +" is a positive number");
    }
    sc.close();
   } 
}
