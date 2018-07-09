package com.cjcit.csvreader;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class OpenCSVFileTest {
	
	private OpenCSVFile openCsv;
	
	@Before
	public void setUp(){
		openCsv = new OpenCSVFile();
	}
	
	@Test
	public void loadFileWithInvalidPathTest() {
		openCsv.loadFile("C:/Users/hello.csv");
	}
	
	@Test
	public void loadNonCSVFileTest() {
		openCsv.loadFile("C:/Users/jasdeep.aulakh/Desktop/Dan Report 2.csv");
	}

}
