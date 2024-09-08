
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
public class Retangle {
    public static void main(String[] args) {
        float width;
        float height;
        
        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter width ");
        width=sc.nextFloat();
        System.out.println("enter heigh ");
        height=sc.nextFloat();
        //tinh area
        float area=width*height;
        System.out.println("area= "+area);
        
        
    }
}
