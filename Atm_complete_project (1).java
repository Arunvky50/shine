import java.util.*;
public class Atm_complete_project
{

  public static void main (String[]args)
  {
    int addamount = 0;
    int takeamount = 0;
    int balance = 10000;
    int pin = 1267;
    String name;

    Scanner scanner = new Scanner (System.in);
      System.out.println ("enter your pin");
    int password = scanner.nextInt ();

    if (password == pin)
      {
	System.out.println ("enter your name");
	name = scanner.next ();
	System.out.println ("welcome " + name);
      }
    else
      {
	System.out.println ("wrong pin enter it correctly");
      }

    while (true)
      {
	System.out.println ("press 1 to check balance");
	System.out.println ("press 2 to  add amount");
	System.out.println ("press 3 to  takeamount");
	System.out.println ("press 4 to  take receipt");
	System.out.println ("press 5 to  exit");

	int opt = scanner.nextInt ();
	switch (opt)

	  {
	  case 1:
	    System.out.println ("your current balance is " + balance);
	    break;

	  case 2:
	    System.out.println ("how much amount did you want to add");
	    addamount = scanner.nextInt ();
	    System.out.println ("Sucessfully created");
	    balance = addamount + balance;
	    break;
	  case 3:
	    System.out.println ("how much amount did you want to take ");
	    takeamount = scanner.nextInt ();

	    if (takeamount > balance)
	      {
		System.out.println ("your balance is in sufficent");
		System.out.println ("try less than your available balance");
	      }

	    else
	      {
		System.out.println ("sucessfully taken");
		balance = balance - takeamount;
	      }
	    break;

	  case 4:
	    System.out.println ("welcome to all in one atm");
	    System.out.println ("available balance is " + balance);
	    System.out.println ("amount deposited " + addamount);
	    System.out.println ("amount taken " + takeamount);
	    System.out.println ("thanks for coming");

	    break;
	  }

	if (opt == 5)
	  {
	    System.out.println ("thanks for coming");

	  }
      }
  }
}
