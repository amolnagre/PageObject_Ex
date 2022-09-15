package pom_Util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import pom_Core.TestCore;
public class testUtil extends TestCore {

	public static ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\pom_Config\\TestData.xlsx");

	//chcking runmode	
	public static boolean isExecutable(String tcid)// receiving arguments from class UploadPhotoTest adn LoginTest class for reading excel data
	// Here tcid is sheetName of excel sheet & receiving sheetName from LoginTest & UploadPhotoTest for  performing a operation on particular excel sheet  
	{
	String sheetName = "test_suite";// test_suite is sheetName in excel file       
	int rows= excel.getRowCount(sheetName);// count total no.of rows

	for(int rownum=2;rownum<=rows;rownum++)// starts from 2nd rows i.e actual data
	{
		if(excel.getCellData(sheetName,"tcid",rownum).equals(tcid)){
			if(excel.getCellData(sheetName,"runmode",rownum).equals("Y"))
			{
				return true;
			}else
				return false;
		}
	}
	return false;
}
	
	// Reading or access data from particular sheetName
		@DataProvider
		public static Object[][] getData(String sheetName)// receiving sheetName from LoginTest & UploadPhotoTest
		{
		//	String sheetName = "LoginTest"; or String sheetName = "PhotoUploadTest"; 
			int rows = excel.getRowCount(sheetName);//// count total no.of rows i.e 2
			int cols = excel.getColumnCount(sheetName);//// count total no.of columns i.e 2
			
//			System.out.println("Rows=   "+rows+"  Columns=   "+cols);//Rows=2,Columns=2
			
			Object[][] data = new Object[rows-1][cols];//[1][2]
			
			for(int rowNum=2;rowNum<=rows;rowNum++){//for Rows= 2 
				for(int colNum=0;colNum<cols;colNum++){//for Columns= 0,1 columns always start from 0
					data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);// colNum=0,rowNum=1
					//data[0][0]= amolnagre@rediffmail.com
					//data[0][1]= password
				}
			}
			return data;
		}

	public static String mailscreenshotpath;
	
	//public static WebDriver driver;
	
	public static void captureScreenshot(String methodName) throws IOException{
		
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		mailscreenshotpath = System.getProperty("user.dir")+"\\screenshot\\"+methodName+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
		FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		}
	
	/*
    try {
    	
    	mailscreenshotpath = methodName+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
    	
    	FileUtils.copyFile(scrFile, new File("C:\\11_Jan_2020Batch\\TestNG_ListenersOnFailure\\Screenshot "+mailscreenshotpath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	*/
	
	// make zip of reports
		public static void zip(String filepath){
		 	try
		 	{
		 		File inFolder=new File(filepath);
		 		File outFolder=new File("Reports.zip");
		 		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
		 		BufferedInputStream in = null;
		 		byte[] data  = new byte[1000];
		 		String files[] = inFolder.list();
		 		for (int i=0; i<files.length; i++)
		 		{
		 			in = new BufferedInputStream(new FileInputStream
		 			(inFolder.getPath() + "/" + files[i]), 1000);  
		 			out.putNextEntry(new ZipEntry(files[i])); 
		 			int count;
		 			while((count = in.read(data,0,1000)) != -1)
		 			{
		 				out.write(data, 0, count);
		 			}
		 			out.closeEntry();
	  }
	  out.flush();
	  out.close();
		 	
	}
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  } 
	 }	
}