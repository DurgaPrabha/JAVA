package mini_prj_prg;

import java.util.Scanner;

public class BankApp 
{
	public static void main(String[] args)
	{
		BankAccount bc=new BankAccount("Durga","Shri@0420");
		bc.showMenu();
	}
}
class BankAccount
{
	int bal=0;
	int prevTrans;
	String custName;
	String custId;
	
	public BankAccount(String cname, String cid)
	{
		custName=cname;
		custId=cid;
		
	}
	public void deposit(int amt)
	{
		if(amt!=0)
		{
			bal=bal+amt;
			prevTrans=amt;
			System.out.println(bal);
		}
	}
	public void withdraw(int amt)
	{
		if(amt!=0)
		{
			bal=bal-amt;
			prevTrans=-amt;
			System.out.println(bal);
		}
	}
	public void getPrevTrans()
	{
		if(prevTrans>0)
		{
			System.out.println("Deposited: "+prevTrans);
		}
		else if(prevTrans<0)
		{
			System.out.println("Withdrawn: "+Math.abs(prevTrans));
		}
		else
		{
			System.out.println("No transaction occurred");
		}
	}
	public void showMenu()
	{
		char opt='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome " +custName);
		System.out.println("Your Id is: "+custId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("========================================================");
			System.out.println("Enter an option: ");
			System.out.println("========================================================");
			opt=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(opt)
			{
			case 'A':
				System.out.println("====================================================");
				System.out.println("Balance: "+bal);
				System.out.println("====================================================");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("====================================================");
				System.out.println("Enter an amount to be deposited");
				System.out.println("====================================================");
				int amt1=sc.nextInt();
				deposit(amt1);
				System.out.println("Amount deposited");
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("====================================================");
				System.out.println("Enter an amount to withdraw");
				System.out.println("====================================================");
				int amt2=sc.nextInt();
				withdraw(amt2);
				System.out.println("Amount withdrawn");
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("====================================================");
				getPrevTrans();
				System.out.println("====================================================");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("=====================================================");
				break;
				
				default:
					System.out.println("Invalid Option, Enter again!!!");
					break;
			   }
			}while(opt!='E');
		}
    }
