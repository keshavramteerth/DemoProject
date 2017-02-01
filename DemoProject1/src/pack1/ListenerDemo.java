package pack1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(pack1.SampleListener.class)
public class ListenerDemo 
{
	@Test
	public void methodA()
	{
		System.out.println("Message1");
	}
	
	@Test
	public void methodB()
	{
		System.out.println("Message2");
	}

}
