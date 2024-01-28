import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in the form of (DD MM YYYY) : ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        day(day, month, year);
    }

    public static void day(int day, int month, int year) {
        boolean leap = isLeap(year);
        int dim = mthsToDays(month, leap);
        int diy = yrsToDays(year, leap);
        int totalDays = dim + diy + day - 1;
        int ans = totalDays % 7;
        switch (ans) {
            case 0:
                System.out.println("SATURDAY");
                break;
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
        }
    }

    public static int mthsToDays(int month, boolean leap) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 1) {
            return 0;
        }
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += daysInMonth[i - 1];
        }
        if (leap && month > 2) {
            days += 1;
        }
        return days;
    }

    public static int yrsToDays(int year, boolean leap) {
        int rtn = 0;
        for (int i = 2000; i < year; i++) {
            rtn += isLeap(i) ? 366 : 365;
        }
        return rtn;
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
