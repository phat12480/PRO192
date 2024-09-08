
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
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("which month to count day");
        int month =sc.nextInt();
        String dayInMonth;
        //chon
        switch(month){
            case 2:
                dayInMonth="28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth="30";
                break;
            default:
                dayInMonth="";
                break;
        }
        
        if(!dayInMonth.equalsIgnoreCase("")){
            System.out.printf("the month %d has %s days",month,dayInMonth);
        }
        else {
            System.out.println("invalid days");
        }
            
        
        
        
        
        
    }
    
    
    
}
