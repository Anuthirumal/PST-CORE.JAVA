package Corejavaprogram;
import java.util.Scanner;
public class Digitcount {

	public static void main(String[] args) {
		 
               Scanner sc = new Scanner(System.in);

		        int num = sc.nextInt();
		        int count = 0;

		        while (num != 0) {
		            count++;
		            num = num / 10;
		        }

		        System.out.println("Digit count = " + count);
		        sc.close();
		    }
		


	}


