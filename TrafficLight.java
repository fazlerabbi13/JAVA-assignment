import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char signal = scanner.next().charAt(0);
        
             if(signal == 'R')
             System.out.println("Stop");
            
            else if(signal=='Y')
             System.out.println("Ready");
              
            else if(signal=='G')
            System.out.println("Go"); 

            else
            System.out.println("Invalid input");
        }  
    }

