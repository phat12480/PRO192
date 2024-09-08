
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
public class ChangNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so chu so");
        String input=sc.nextLine();
        
        StringBuilder strbd=new StringBuilder(input);
        String reversed=strbd.reverse().toString();
        
        for (int i = 0; i < reversed.length(); i++) {
            char position=reversed.charAt(i);
            
            switch(i){
                
                case 0:
                    if(position=='1'){
                        System.out.print("mot");
                    }
                    else if(position=='2'){
                        System.out.print("hai");
                    }else if(position=='3'){
                        System.out.print("ba");
                    }else if(position=='4'){
                        System.out.print("bon");
                    }else if(position=='5'){
                        System.out.print("nam");
                    }else if(position=='6'){
                        System.out.print("sau");
                    }else if(position=='7'){
                        System.out.print("bay");
                    }else if(position=='8'){
                        System.out.print("tam");
                    }else if(position=='9'){
                        System.out.print("chin");
                    }else if(position=='0'){
                        System.out.print("khong");
                    }
                    System.out.print(" tram ");
                    break;
                    
                case 1:
                    if(position=='1'){
                        System.out.print("mot");
                    }
                    else if(position=='2'){
                        System.out.print("hai");
                    }else if(position=='3'){
                        System.out.print("ba");
                    }else if(position=='4'){
                        System.out.print("bon");
                    }else if(position=='5'){
                        System.out.print("nam");
                    }else if(position=='6'){
                        System.out.print("sau");
                    }else if(position=='7'){
                        System.out.print("bay");
                    }else if(position=='8'){
                        System.out.print("tam");
                    }else if(position=='9'){
                        System.out.print("chin");
                    }else if(position=='0'){
                        System.out.print("khong");
                    }
                    System.out.print(" muoi ");
                    break;
                    
                case 2:
                    if(position=='1'){
                        System.out.print("mot");
                    }
                    else if(position=='2'){
                        System.out.print("hai");
                    }else if(position=='3'){
                        System.out.print("ba");
                    }else if(position=='4'){
                        System.out.print("bon");
                    }else if(position=='5'){
                        System.out.print("nam");
                    }else if(position=='6'){
                        System.out.print("sau");
                    }else if(position=='7'){
                        System.out.print("bay");
                    }else if(position=='8'){
                        System.out.print("tam");
                    }else if(position=='9'){
                        System.out.print("chin");
                    }else if(position=='0'){
                        System.out.print("khong");
                    }
                    System.out.print("");
                    break;    
                    
            }
                    
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
