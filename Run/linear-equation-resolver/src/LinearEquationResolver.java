
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
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("linear equation resolver");
        System.out.println("given a equatioin as ax+b=c");
        System.out.println("enter contants");
        Scanner sc=new Scanner(System.in);
        System.out.println("a: ");
        double a=sc.nextDouble();
        System.out.println("b: ");
        double b=sc.nextDouble();
        System.out.println("c: ");
        double c=sc.nextDouble();
        //tim nghiem
        if(a!=0){
            double answer=(c-b)/a;
            System.out.printf("equation x= %f! \n", answer);
        }
        else if(b==c){
            System.out.println("solution all x!");
        } 
        else {
            System.out.println("no solution!");
        }
        
        
        
    }
}
