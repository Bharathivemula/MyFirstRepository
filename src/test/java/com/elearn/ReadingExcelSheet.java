package com.elearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelSheet {
	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\Bharathi java\\FrameWorkDataDriven\\InputStream\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(1);
		//System.out.println(r);
		System.out.println(c);
		
		
		
	}

}