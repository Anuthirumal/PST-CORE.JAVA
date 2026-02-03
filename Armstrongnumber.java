package JavaBasic;

public class Armstrongnumber {

	public static void main(String[] args) {
		            int num = 153;    
			        int temp = num;
			        int sum = 0;

			        while (num > 0) {
			            int n = num % 10;
			            sum = sum + n * n * n;
			            num = num / 10;
			        }

			        if (temp == sum)
			             System.out.println(temp + " is Armstrong number");
			        else
			        	System.out.println(temp + " is not a Armstrong number");
			    }
}


