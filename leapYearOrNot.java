import java.util.*;
public class leapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        lpOrNot(year);
    }
    public static void lpOrNot(int year){
        if(year%400==0||year%4==0){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
