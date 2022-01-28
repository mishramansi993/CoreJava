package MultiThreading;

public class ThreadDemo1 {

	public static void main(String[] args) {
		A oa1 =new A(10,1,"First");
		A oa2 =new A(5,0,"Second");
		B ob=new B("Third");
		
		Thread t1=new Thread(oa1);
		Thread t2=new Thread(oa2);
		Thread t3=new Thread(ob);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		try
		{
		t1.join();
		t2.join();
		t3.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Have a nice day");
		}
	}


