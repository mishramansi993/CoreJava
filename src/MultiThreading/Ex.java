package MultiThreading;
import java.util.*;

public class Ex extends Thread {

	public static void main(String[] args) {
    int st;
    String msg;
	}

	private int st;
	private String msg;

public Ex( String msg,int st) {
	this.st = st;
	this.msg = msg;
}

@Override
public void run() {
	for (int i=1;i<=10;i++)
	{
		try
	{
			Thread.sleep(st);
	}
	catch(Exception e)
	{
		
	}

	System.out.println(msg + i);
}
}
}