import java.util.Scanner;

public class salary {
    static double cal_salary(double basic){
        double hra,da;
        da=basic*0.5;
        hra=basic*0.2;

        return basic+da+hra;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        double basic=sc.nextDouble();
        double total=cal_salary(basic);
        System.out.println("the total salary is: "+total);
        sc.close();
    }
    
}
