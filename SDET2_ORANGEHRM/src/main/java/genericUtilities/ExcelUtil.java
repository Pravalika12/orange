package genericUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtil {
	/**
	 * @author lenovo
	 * Description:creating excel object
	 * @param sheetname
	 * @return
	 */
	public static ExcelUtil objOfExcelUtil()
	{
		ExcelUtil e1=new ExcelUtil();
		return e1;
	}
	
	public int getLastRow(String sheetname) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(IAutoConstants.excelpath);
		Workbook workbook =WorkbookFactory.create(fis);

		return workbook.getSheet(sheetname).getLastRowNum();
	}
	public String selectValueFromDD(String sheetname,String cellvalue,String DDValue) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IAutoConstants.excelpath);
		Workbook workbook =WorkbookFactory.create(fis);
		Sheet sh=workbook.getSheet(sheetname);
		int lastrow=getLastRow(sheetname);
		String value="Null";
		for(int i=0;i<=lastrow;i++)
		{
			value=sh.getRow(i).getCell(i).getStringCellValue();
			if(value.equalsIgnoreCase(DDValue))
			{
				break;
			}
			
		}
		return value;
	}
	
}
