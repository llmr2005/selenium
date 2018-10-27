package dataDrivenFrameWork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Fileoutputstream_sample {

	public static void main(String[] args) throws IOException, JXLException {
		// TODO Auto-generated method stub
		FileOutputStream fo = new FileOutputStream(".\\testdata\\output.xls");
		WritableWorkbook ww = Workbook.createWorkbook(fo);
		WritableSheet ws = ww.createSheet("Lakshman",0);
		Label a = new Label(0,6,"Selenium");
		ws.addCell(a);
		Label b = new Label(2,7,"Seleniumtest1");
		ws.addCell(b);
		
		ww.write();
		ww.close();

	}

}
