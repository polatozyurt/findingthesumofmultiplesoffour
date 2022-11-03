import java.util.Scanner ;

public class findingcounts_multiplesof4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The program that count the integers taken from user which are the multipliers of 4 
		Scanner input = new Scanner (System.in);
		//defining variables
		int n, count ;
		
		count = 0 ;
		//Taking input from the user 
		do{
			System.out.print("Enter numbers for counting: (Enter a negative number to end the program: ");
			n=input.nextInt();
			if(n%2==0 && n%4==0) {
				count += n ;
				
			}
			
		}
		while(n>0); {
			
			
		}
		
		System.out.print("Total of the numbers that can be divided by 4 and numbers that are even are : "+ count);
		
	}

}
