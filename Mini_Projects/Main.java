/* WAJP where Recharge is a method, you have to recharge by using followig methods - UPI, NetBanking and card */

package test;
import java.util.Scanner;

public class Main {
	void rechargeWithUpiId(String UpiId, double Amount) {
		System.out.println("Recharge of Airtel is started");
		System.out.println("Your UPI ID : " + UpiId);
		System.out.println("Amount : $" + Amount);
		System.out.println("Recharged successfully");
	}

	void rechargeWithNetBanking(String Name, String ANo, String IFSC, double amut) {
		System.out.println("Recharge of Airtel is started");
		System.out.println("Name : " + Name);
		System.out.println("Account Number : " + ANo);
		System.out.println("Amount : $" + amut);
		System.out.println("Recharged successfully");
	}

	void rechargeWithCard(String cardNo, String name, String eda, String cvv, double at) {
		System.out.println("Recharge of Airtel is started");
		System.out.println("Card No. : " + cardNo);
		System.out.println("Name : " + name);
		System.out.println("Expiry date : " + eda);
		System.out.println("CVV : " + cvv);
		System.out.println("Amount : $" + at);
		System.out.println("Recharged successfully");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Airtel a = new Airtel();
		System.out.println("Select Recharge Method : ");
		System.out.println("Enter 1 for UPI");
		System.out.println("Enter 2 for Net Banking");
		System.out.println("Enter 3 for Card");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You are recharging your Airtel plan by UPI ID");
			System.out.print("Enter your UPI ID : ");
			String UpiId = sc.next();
			System.out.print("Enter your amount to recharge : ");
			double UpiAmt = sc.nextDouble();
			a.rechargeWithUpiId(UpiId, UpiAmt);
			break;
		case 2:
			System.out.println("You are reacharging your Airtel plan by Net Banking");
			System.out.print("Enter your Name : ");
			String Name = sc.next();
			System.out.print("Enter your Account Number : ");
			String Acn = sc.next();
			System.out.print("Enter IFSC Code : ");
			String ifs = sc.next();
			System.out.print("Enter your amount to recharge: ");
			double amt = sc.nextDouble();
			a.rechargeWithNetBanking(Name, Acn, ifs, amt);
			break;
		case 3:
			System.out.println("You are reacharging your Airtel plan by Credit Card");
			System.out.println("Enter Card Number : ");
			String cardNo = sc.next();
			System.out.println("Enter Card Holder Name : ");
			String name = sc.next();
			System.out.print("Enter Expiry Date(MM/YY) : ");
			String eda = sc.next();
			System.out.print("Enter CVV : ");
			String cvv = sc.next();
			System.out.print("Enter your amount to recharge : ");
			double at = sc.nextDouble();
			a.rechargeWithCard(cardNo, name, eda, cvv, at);
			break;
		default:
			System.out.println("Invalid Credentials");
			break;
		}
	}
}
