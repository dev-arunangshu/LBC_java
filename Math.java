import java.util.Scanner;
class Square{
int square(int n){
    return n*n;
}
}
public class Math{
    public static void main(String[] args) {
        System.out.println("enter the number you want to find square of");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        System.out.println("the square of the number "+x+" is");
        Square s = new Square();
        System.out.println(s.square(x));
        sc.close();
    }
}
