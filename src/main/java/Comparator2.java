//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//
//public class Comparator2 {
//
//
//    try (FileInputStream fileInputStream = new FileInputStream(file);
//    XSSFWorkbook workbook = new XSSFWorkbook(file)) {
//        XSSFSheet sheet = workbook.getSheetAt(0);
////        Iterator<Row> rowIterator = sheet.iterator();
//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//
//            Iterator<Cell> cellIterator = row.cellIterator();
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//                switch (cell.getCellType()) {
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.print(cell.getNumericCellValue() + "(Integer)\t");
//                        break;
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.print(cell.getStringCellValue() + "(String)\t");
//                        break;
//                }
//            }
//            System.out.println("");
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
