import java.util.*;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();
        System.out.println(num1&num2);
        System.out.println(num1|num2);
        System.out.println(num1^num2);
        System.out.println(~num1);
        System.out.println(num1>>num2);
        System.out.println(num1<<num2);
    }
}