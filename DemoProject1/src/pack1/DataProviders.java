package pack1;

import java.io.File;


import org.testng.annotations.DataProvider;
import jxl.Sheet;
import jxl.Workbook;
public class DataProviders 
{
	String[][] tabArray = null;
    Workbook workbk;
    Sheet sheet;
    int rowCount, colCount;
	String sheetPath = "E:\\TEST_DATA\\mynew1.xls";
	
	public String[][] getExcelData(String xlPath, String shtName)throws Exception 
    {
       
		Workbook workbk = Workbook.getWorkbook(new File(xlPath));
        Sheet sheet = workbk.getSheet(shtName);
        rowCount = sheet.getRows();
        colCount = sheet.getColumns();
        tabArray = new String[rowCount][colCount];
        System.out.println("erow: " + rowCount);
        System.out.println("ecol: " + colCount);
        for (int i = 0; i < rowCount; i++) 
        {
            for (int j = 0; j < colCount; j++) 
            {
                tabArray[i][j] = sheet.getCell(j, i).getContents();
            }
        }
        return (tabArray);
    }
	
	@DataProvider
    public Object[][] getcretaestudentData() throws Exception 
    {
        Object[][] retObjArr = getExcelData(sheetPath, "Sheet1");
        System.out.println("getData function executed!!");
        return retObjArr;
    }
}
