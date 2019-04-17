package com.sik.bsse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static final String SQ = "\'";
	private static final String DQ = "\"";
	private static final String SP = " ";
	// Cell Indices
	private static final int I_REF = 0;
	private static final int I_LNAM = 1;
	private static final int I_COLLNM = 2;
	private static final int I_COLCRNDSC = 3;
	private static final int I_COLCRNPRD = 4;
	private static final int I_COLCRNSIT = 5;
	private static final int I_PUBCRNDSC = 6;
	private static final int I_PUBCRNPRD = 7;
	private static final int I_PUBCRNSIT = 8;

	public Collection<Schedule> getSchedulesFromFile(String fileName) {

		Collection<Schedule> schedules = new ArrayList<>();

		try {

			FileInputStream excelFile = new FileInputStream(new File(fileName));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();

			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				schedules.add(this.buildSchedule(currentRow));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return schedules;
	}

	private Schedule buildSchedule(Row currentRow) {
		Schedule sched = new Schedule();
		Iterator<Cell> cellIterator = currentRow.iterator();

		while (cellIterator.hasNext()) {

			Cell currentCell = cellIterator.next();

			switch (currentCell.getColumnIndex()) {
			case I_REF:
				sched.setRef(currentCell.getStringCellValue().trim());
				break;
			case I_LNAM:
				sched.setLongName(currentCell.getStringCellValue().trim());
				break;
			case I_COLLNM:
				sched.setCollectorName(currentCell.getStringCellValue().trim());
				break;
			case I_COLCRNDSC:
				sched.setCollectorCronDesc(currentCell.getStringCellValue().trim());
				break;
			case I_COLCRNPRD:
				sched.setCollectorCronValueProd(currentCell.getStringCellValue().trim());
				break;
			case I_COLCRNSIT:
				sched.setCollectorCronValueSit(currentCell.getStringCellValue().trim());
				break;
			case I_PUBCRNDSC:
				sched.setPublisherCronDesc(currentCell.getStringCellValue().trim());
				break;
			case I_PUBCRNPRD:
				sched.setPublisherCronDesc(currentCell.getStringCellValue().trim());
				break;
			case I_PUBCRNSIT:
				sched.setPublisherCronValueSit(currentCell.getStringCellValue().trim());
				break;
			default:
				throw new IllegalStateException("Unknown cell index: " + currentCell.getColumnIndex());
			}
		}

		return sched;
	}

}
