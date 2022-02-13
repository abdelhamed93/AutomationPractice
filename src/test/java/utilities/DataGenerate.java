package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataGenerate {
	public String[][] read_excel() throws InvalidFormatException, IOException {
		File myfile = new File(".\\data\\vois1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(myfile);
		XSSFSheet mysheet = wb.getSheetAt(0);
		int Rows_Num = mysheet.getPhysicalNumberOfRows();
		int columns = mysheet.getRow(0).getLastCellNum();
		String[][] myarray = new String[Rows_Num - 1][columns];
		for (int i = 1; i < Rows_Num; i++) {
			for (int a = 0; a < columns; a++) {
				XSSFRow row = mysheet.getRow(i);
				myarray[i - 1][a] = row.getCell(a).toString();
				// wb.close();
			}
		}
		wb.close();
		return myarray;

	}
}
