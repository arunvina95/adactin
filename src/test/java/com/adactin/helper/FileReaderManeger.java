package com.adactin.helper;

public class FileReaderManeger {
	public FileReaderManeger() {
	
	}
	public ConfigurationReader getInstance() throws Throwable {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;

	}
   public static FileReaderManeger getInstanceCR() {
	FileReaderManeger he = new FileReaderManeger();
	return he;

}
}
