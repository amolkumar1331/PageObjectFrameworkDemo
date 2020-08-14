package ExcelOperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static FileInputStream fp;

	public static Workbook wb;
	public static Sheet sh;
	public static Row rw;
	public static Cell cel;

	public ExcelRead() throws IOException {

		fp = new FileInputStream("D:\\Class\\PageObjectFramewor\\src\\test\\java\\Resource\\Data.xlsx");
		wb = new XSSFWorkbook(fp);
		sh = wb.getSheet("Sheet1");

	}

	public Object[][] getData() {

		int totalrow = sh.getLastRowNum();
		rw = sh.getRow(1);
		int totalcell = rw.getLastCellNum();
		Object[][] obj = new Object[totalrow][totalcell];

		for (int i = 1; i <= totalrow; i++) {
			for (int j = 0; j < totalcell; j++) {
				cel = sh.getRow(i).getCell(j);
				if (cel.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					int k = (int) cel.getNumericCellValue();
					obj[i - 1][j] = Integer.toString(k);
				} else {
					obj[i - 1][j] = cel.getStringCellValue();
				}

			}
		}
		return obj;

	}

}
