package Utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import java.text.SimpleDateFormat;


public class ExcelWriter {


    public static void excelWriter(String applicationNumber) {
        try {
            //Fetch the class and method name
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            StackTraceElement callingElement = stackTraceElements[2];
            String methodName = callingElement.getMethodName();
            String className = callingElement.getClassName();
            String testMethodName = "Class: " + className + ", Method: " + methodName;

            String file = "src/main/java/ExcelData/Book.xlsx"; // set the file path here

            //File writing code
            FileInputStream inputStream = new FileInputStream(new File(file));
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheet("Sheet1");
            if (sheet == null) {
                sheet = workbook.createSheet("Sheet1");
            }
            Row row = sheet.createRow(sheet.getLastRowNum() + 1);
            Cell appNumCell = row.createCell(0);
            appNumCell.setCellValue(applicationNumber);
            Cell testMethodCell = row.createCell(1);
            testMethodCell.setCellValue(testMethodName);
            Cell timestampCell = row.createCell(2); // create cell for timestamp
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            String formattedDate = dateFormat.format(new Date());
            timestampCell.setCellValue(formattedDate); // set formatted date/time as cell value
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Application Number \"" + applicationNumber + "\", Test Method Name \"" + testMethodName + "\" and Timestamp written to columns " + 0 + ", " + 1 + " and " + 2 + " of sheet \"Sheet1\" in file \"" + file + "\"");
        } catch (Exception e) {
            System.out.println("An error occurred while writing the values to the Excel file: " + e.getMessage());
        }
    }


    public static void testingmethod(){

        excelWriter("1100");
    }

    public static void main(String args []) {
        testingmethod();
    }
}
