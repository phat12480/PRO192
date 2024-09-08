
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class LeapYearCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("enter year");
        year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleby4=year%4==0;
        //check
        if (isDivisibleby4) {
            boolean isDivisibleby100=year%100==0;
            if (isDivisibleby100) {
                boolean isDivisibleBy400=year%400==0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                } else {
                    isLeapYear = true;
                }
            }

        }
        
        if(isLeapYear){
            System.out.printf("%d is leap year",year);
        }
        else {
            System.out.printf("%d is not leap year",year);
        }
        
        
        
    }
}
