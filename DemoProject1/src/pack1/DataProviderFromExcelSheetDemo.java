package pack1;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class DataProviderFromExcelSheetDemo extends DataProviders {

	@Test(dataProvider="getcretaestudentData")
	public void Login(String username, String password) throws BiffException, IOException
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
		System.out.println();
	}
}
