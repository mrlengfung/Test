package test.automation.common;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

/**
 * Created by mmasi03 on 1/29/2016.
 */
public class ExcelUtils {

    private XSSFSheet ExcelWSheet;
    private XSSFWorkbook ExcelWBook;
    private XSSFCell Cell;

    //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
    public void setExcelFile(String Path, String SheetName) throws Exception {
        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(Path);

            // Access the required test data sheet
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        } catch (Exception e) {
            throw (e);
        }

    }

    public Object[][] getTableArray(String TestName) {

        String[][] tabArray = null;

        do {
            try {
                int startCol = 2;
                int startRow = 1;
                int ci=0,cj=0;
                int availableRows = getRowUsed();
                int availableCols = getCountOfAvailableColumns(TestName);
                int totalRows = getCountOfTestCaseInstance(TestName);
                int totalCols = getCountOfTestCaseData(TestName);
                tabArray = new String[totalRows][totalCols];

                for(ci=0;ci<=totalRows;ci++){
                    for(int i=startRow;i<=availableRows;i++){
                        if(getCellData(i, 1).equals(TestName)){
                            cj=0;
                            for(int j=startCol;j<availableCols+2;j++, cj++){
                                if(!(getCellData(i,j) == null) && !getCellData(i,j).isEmpty()){
                                    try {
                                        tabArray[ci][cj]=getCellData(i,j);
                                    } catch (ArrayIndexOutOfBoundsException e){
                                        j = availableCols+2;
                                        i = availableRows + 1;
                                        ci = totalRows + 1;
                                        tabArray[0][0] = null;
                                    }
                                }else{
                                    cj--;
                                }
                            }
                            ci++;
                        }
                    }
                }

//                for(int i=startRow;i<=getRowUsed();i++){
//                    if(getCellData(i, 1).equals(TestName)){
//                        for(int j=startCol;j<availableCols+2;j++, cj++){
//                            if(!(getCellData(i,j) == null) && !getCellData(i,j).isEmpty()){
//                                tabArray[ci][cj]=getCellData(i,j);
//                            }else{
//                                cj--;
//                            }
//                        }
//                        ci++;
//                    }
//                }

//        } catch (FileNotFoundException e) {
//            System.out.println("File '" + FilePath + "' was not found.");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Could not read the file '" + FilePath + "'.");
//            e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(tabArray[0][0] == null){
                tabArray = null;
            }

        } while (tabArray == null);

        return (tabArray);
    }

    public String getCellData(int RowNum, int ColNum){
        String CellData = null;
        Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
        if(!(Cell == null)){
            Cell.setCellType(Cell.CELL_TYPE_STRING);
            CellData = Cell.getStringCellValue();
        }

        return CellData;
    }

    public int getRowUsed(){
        int RowCount = ExcelWSheet.getLastRowNum();
        return RowCount;
    }

    public int getCountOfTestCaseInstance(String testName){

        int dataCount = 0;
        for(int i=0;i<ExcelWSheet.getLastRowNum()+1;i++){
            if(getCellData(i, 1).equals(testName)) {
                dataCount++;
            }
        }
        return dataCount;
    }

    public int getCountOfAvailableColumns(String testName){
        int ColCount = 0;
        for(int i=0;i<ExcelWSheet.getLastRowNum()+1;i++) {
            if (getCellData(i, 1).equals(testName)) {
                ColCount = ExcelWSheet.getRow(i).getLastCellNum() - 2;
                break;
            }
        }
        return ColCount;
    }

    public int getCountOfTestCaseData(String testName){

        int dataCount = 0;
        int ColCount = 0;
        for(int i=0;i<ExcelWSheet.getLastRowNum()+1;i++) {
            if (getCellData(i, 1).equals(testName)) {
                ColCount = ExcelWSheet.getRow(i).getLastCellNum() - 2;
                for(int ColCounter=2;ColCounter<ColCount+2;ColCounter++) {
                    if(!(getCellData(i,ColCounter) == null) && !getCellData(i,ColCounter).isEmpty()){
                        dataCount++;
                    }
                }
                break;
            }
        }

        return dataCount;
    }
}
