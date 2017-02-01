package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithinClassDemo 
{
	@Test(dataProvider="getData")
	public void Login(String username, String password)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
		System.out.println();
	}

	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="UserName1";
	data[0][1] = "Password1";

	// 2nd row
	data[1][0] ="UserName2";
	data[1][1] = "Password2";
	
	// 3rd row
//	data[2][0] ="UserName3";
//	data[2][1] = "Password3";

	return data;
	}
}
