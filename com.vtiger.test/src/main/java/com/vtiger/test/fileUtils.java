package com.vtiger.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class fileUtils {
	public String readFromProoertyFile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/vTiger.txt");
		Properties pob = new Properties();
		pob.load(fis);
		String value = pob.getProperty(key);
		return value;
	}
}
