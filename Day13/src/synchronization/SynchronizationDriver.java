
package synchronization;

public class SynchronizationDriver {

	public static void main(String[] args) throws InsufficientBalanceException {
		
		
		Account heti=new Account(1001, "Heti", 45000);
		
		System.out.println(heti);
		//heti.withdraw(7865);
		
		AccountThread t[]=new AccountThread[10];
		for(int i=0;i<10;i++)
		{
			t[i] = new AccountThread(heti, 1000 * (i+1));
		}
		try {
			for(int i=0;i<10;i++)
			{
				t[i].join();
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		
		System.out.println("----------------------");
		System.out.println(heti);
		

	}

}
