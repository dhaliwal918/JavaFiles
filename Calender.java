import java.util.*;
public class Calender {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Date : ");
        int date = sc.nextInt();
        System.out.print("Enter the Month : ");
        int month = sc.nextInt();
        int days =0 ;
        switch (month) {
            case 1:
                days = 0 + date;
                break;
            case 2:
                days = 31+date;
                break;
            case 3:
                days = 59+date;
                break;
            case 4:
                days = 90+date;
                break;
            case 5:
                days = 120+date;
                break;
            case 6:
                days = 151+date;
                break;
            case 7:
                days = 181+date;
                break;
            case 8:
                days = 212+date;
                break;
            case 9:
                days = 243+date;
                break;
            case 10:
                days = 273+date;
                break;
            case 11:
                days = 304+date;
                break;
            case 12:
                days = 334+date;
                break;
            default:
                break;
        }
        int ans = days % 7;
        switch (ans) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
                break;
        }
    }
}
