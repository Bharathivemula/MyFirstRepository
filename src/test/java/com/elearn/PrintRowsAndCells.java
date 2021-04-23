package com.elearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintRowsAndCells {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\Bharathi java\\FrameWorkDataDriven\\InputStream\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s=w.getSheet("Sheet1");
		//Row r=s.getRow(1);
		
		//int rows=s.getPhysicalNumberOfRows();
		//int cells=r.getPhysicalNumberOfCells();
		//Row r=s.getRow(0)
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r=s.getRow(i);
		
			
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c=r.getCell(j);
				
				System.out.println(c);
				
			}
		}
			
			
		//	Cell c=r.getCell(i);
			//System.out.println(c);
		//}
		
		
	}

}
