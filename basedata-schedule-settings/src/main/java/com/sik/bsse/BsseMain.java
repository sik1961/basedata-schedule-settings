package com.sik.bsse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BsseMain {

	public static void main(String[] args) {
		
		String spready = "/media/sf_vmShared/basedata-schedule-settings.xlsx";
		
		ExcelReader reader = new ExcelReader();
		Collection<Schedule> schedules = reader.getSchedulesFromFile(spready);
		
		Set<String> collectorCronDescs = new HashSet<>();
		Set<String> publisherCronDescs = new HashSet<>();
		
		for (Schedule sched : schedules) {
			System.out.println(sched);
			collectorCronDescs.add(sched.getCollectorCronDesc());
			publisherCronDescs.add(sched.getPublisherCronDesc());
		}
		
		for (String desc: collectorCronDescs) {
			System.out.println("Collector: " + desc);
		}
		for (String desc: collectorCronDescs) {
			System.out.println("Publisher: " + desc);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
