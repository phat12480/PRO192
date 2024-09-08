
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
public class ConvertCurrency {
    public static void main(String[] args) {
        double rate=23000;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao usd");
        double usd=sc.nextDouble();
        double vnd=usd*rate;
        System.out.printf("%.2f usd = %.0f vnd",usd,vnd);
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
