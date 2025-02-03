import java.util.*;
public class sub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        int sub = a+b;
        System.out.println("The subtraction of "+a+" and "+b+" is :"+sub);
        sc.close();
    }
}