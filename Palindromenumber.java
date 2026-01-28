package Corejavaprogram;
import java.util.Scanner;
public class Palindromenumber {

	public static void main(String[] args) {
		 
                Scanner sc = new Scanner(System.in);

		        int num, rev = 0, temp;

		        System.out.print("Enter a number: ");
		        num = sc.nextInt();

		        temp = num;    

		        while (num != 0) {
		            int digit = num % 10;
		            rev = rev * 10 + digit;
		            num = num / 10;
		        }

		        if (temp == rev)
		            System.out.println("Palindrome number");
		        else
		            System.out.println("Not a palindrome number");
		        sc.close();

		    }
		
}
 

