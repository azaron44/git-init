package School;

import java.util.Scanner;

public class ChangeM {

	public static void main(String[] args) 
	{
		System.out.println("Enter amount of change");
		Scanner in = new Scanner(System.in);
		double amount = in.nextDouble();
		
		
		amount=(int)getQuarters(amount);
		amount=(int)getDimes(amount);
		amount=(int)getNickels(amount);
		amount=(int)getPennies(amount);

	}
	public static double getQuarters(double amount) 
	{
		double giveChange = amount % 25 ;
		double quarters = (amount - giveChange) / 25;
		System.out.println((int) quarters +  "  Total Quaters");
		return giveChange;
	}
	public static double getDimes(double amount) 
	{
		double givenChange = amount % 10;
		double dimes = (amount - givenChange) / 10;
		System.out.println((int) dimes +  "  Total dimes");
		return givenChange;
	}
	public static double getNickels(double amount) 
	{
		double givenChange = amount % 5;
		double nick = (amount - givenChange) / 5;
		System.out.println((int) nick +  "  Total nick");
		return givenChange;
	}
	public static double getPennies(double amount) 
	{
		double givenChange = amount % 1;
		double nick = (amount - givenChange) / 1;
		System.out.println((int) nick +  "  Total pennies");
		return givenChange;
	}
	

}
