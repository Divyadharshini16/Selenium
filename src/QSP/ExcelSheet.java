package QSP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	public static void main(String [] args) throws EncryptedDocumentException, IOException
	{
	//Create and Read the file
		
	FileInputStream  f = new FileInputStream("./Data/input.xlsx");
	
	Workbook w =WorkbookFactory.create(f);
	Sheet s=w.getSheet("Sheet1");
	Row r =s.getRow(1);
	Cell c =r.getCell(1);
	String data = c.toString();
	System.out.println(data);
	
	//Directly call all these methods
	int rc =s.getLastRowNum();
	System.out.println(rc);
	for(int i=0;i<=rc;i++)
	{
		int cc = s.getRow(i).getLastCellNum();
		for(int j=0;j<cc;j++)
		{
			String data1 = s.getRow(i).getCell(j).toString();
			System.out.println(data1 +"\t");
		}
		System.out.println();
		}
	}
	
	
	
	
	 
	
	
	}

	