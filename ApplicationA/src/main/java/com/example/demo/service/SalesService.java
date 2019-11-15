package com.example.demo.service;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.example.demo.model.Sales;

public class SalesService {

	public List<Sales> saveDetails() throws Exception {
		List<Sales> arraySalesList = new ArrayList<Sales>();

		try (BufferedReader reader = Files.newBufferedReader(Paths.get("D:\\work\\SalesRecords.csv"));
				CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
						.withHeader("Region", "Country", "Units Sold").withIgnoreHeaderCase().withTrim())) {
			for (CSVRecord csvRecord : csvParser) {
				// Accessing Values by Column Index
				String Region = csvRecord.get(0);
				String Country = csvRecord.get(1);
				Integer unitsSold = Integer.valueOf(csvRecord.get(2));

				arraySalesList.add(new Sales(Region, Country, unitsSold));
				System.out.println("Record No - " + csvRecord.getRecordNumber());

				System.out.println("---------------\n\n");
			}
		}
		return arraySalesList;
	}

}
