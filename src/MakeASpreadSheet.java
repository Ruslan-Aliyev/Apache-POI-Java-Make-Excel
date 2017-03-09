import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;

public class MakeASpreadSheet {
	public static void main(String[] args){
		Workbook workbook=new HSSFWorkbook();
		Sheet aSheet=workbook.createSheet("Sheet1");
		
		Row row1=aSheet.createRow(0);
		Cell cellA=row1.createCell(0);		
		cellA.setCellValue("Cell A x 1");

		Row row2=aSheet.createRow(1);
		Cell cellB=row2.createCell(1);		
		cellB.setCellValue("Cell B x 2");		
		
		try	{
			FileOutputStream output=new FileOutputStream("ASpreadSheet.xls");
			workbook.write(output);
			output.close();
		}catch(Exception e){e.printStackTrace();}		
	}
}
