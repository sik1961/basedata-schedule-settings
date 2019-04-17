package com.sik.bsse;

import java.util.Collection;

public class BsseMain {

	public static void main(String[] args) {
		
		String spready = "/media/sf_vmShared/basedata-schedule-settings.xlsx";
		
		ExcelReader reader = new ExcelReader();
		Collection<Schedule> schedules = reader.getSchedulesFromFile(spready);
		
		for (Schedule sched : schedules) {
			System.out.println(sched);
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
