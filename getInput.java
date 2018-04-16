import java.util.Scanner;
public class getInput {


	public static void main(String[] args) {

		//create the scanner object to take input 
		Scanner scanner = new Scanner(System.in);
	
		//use the scanner object to take input for loanAmt and investmentAmt	
		System.out.print("Enter loan amount:$");
		int loanAmt = scanner.nextInt();

		System.out.print("Enter investement amount:$");
		int investmentAmt = scanner.nextInt(); 

		System.out.println("total = $" + (loanAmt + investmentAmt));

		scanner.close();

	}
}
