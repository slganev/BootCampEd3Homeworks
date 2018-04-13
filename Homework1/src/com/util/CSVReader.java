package com.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

	private static final String CSV = "accounts.csv";
	private static String LINE = "";
	private static final String SPLITER = ",";

    public static ArrayList<String[]> read() {
    	
    	ArrayList<String[]> accounts = null;
    	
    	try (BufferedReader reader = new BufferedReader(new FileReader(CSV))) {
    		accounts = new ArrayList<>();
    		
            while ((LINE = reader.readLine()) != null) {

                String[] accountData = LINE.split(SPLITER);
                accounts.add(accountData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    	return accounts;
    }
    
}
