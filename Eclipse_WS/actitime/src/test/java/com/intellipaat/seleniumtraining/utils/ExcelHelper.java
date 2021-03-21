package com.intellipaat.seleniumtraining.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {
	static File file = null;
	static FileInputStream fis = null;
	static FileOutputStream fos = null;
	static Workbook wb = null;
	static Sheet sh = null;
	static Row row = null;

	public static Workbook getWorkbook() {
		file = new File("data/actitime-testdata.xls");
		try {
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		return wb;
	}

	public static Sheet getMySheet(String sheetname) {
		wb = getWorkbook();
		sh = wb.getSheet(sheetname);
		return sh;
	}

	public static int getRowCount(String sheetname) {
		wb = getWorkbook();
		sh = wb.getSheet(sheetname);
		int rowCount = sh.getLastRowNum() + 1;
		return rowCount;
	}

	public static String getCellValue(String sheetname, int rownum, int colnum)
	{
		String value = null;
		try
		{
			sh = getMySheet(sheetname);
			row = sh.getRow(rownum);
			value  = row.getCell(colnum).toString();
		}
		finally
		{
			try {
				wb.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return value;
	}

	public static void writeStatus(String sheetname, int rownum, int colnum, String valueToSet) throws EncryptedDocumentException, IOException
	{
		try {
			sh = getMySheet(sheetname);
			row = sh.getRow(rownum);
			Cell valueCell = row.createCell(colnum);
			valueCell.setCellValue(valueToSet);
			try {
				fos = new FileOutputStream(file);
				wb.write(fos);
				fos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		finally {
			
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	/*
	 * public static void main(String[] args) throws EncryptedDocumentException,
	 * IOException { getWorkbook(); int sheetCount = wb.getNumberOfSheets();
	 * System.out.println(sheetCount);
	 * 
	 * for (int i = 0; i < sheetCount; i++) {
	 * System.out.println(wb.getSheetName(i));
	 * 
	 * } int rowCount = getRowCount("customerdata");
	 * 
	 * System.out.println("Row count " + rowCount); for (int i = 0; i < rowCount;
	 * i++) {
	 * 
	 * String cell1 = getCellValue("customerdata", i, 0); String cell2 =
	 * getCellValue("customerdata", i, 1); // String cell2 =
	 * row.getCell(1).toString(); System.out.println(cell1 + " | " + cell2);
	 * 
	 * }
	 * 
	 * wb.close(); fis.close();
	 * 
	 * }
	 */

}
