package com.cjcit.csvreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderHeaderAware;

public class OpenCSVFile {
	
	CSVReader csvReader;
	
	public void loadFile(String file) {
		 try {
			csvReader = new CSVReader(new FileReader(file));
			String [] nextLine;
		     while ((nextLine = csvReader.readNext()) != null) {
		        System.out.println(nextLine[0] + " " + nextLine[1] );
		     }
		} catch (FileNotFoundException e) {
			System.out.println(file + " Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
