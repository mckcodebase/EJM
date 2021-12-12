package com.ejm.discovery.api.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.FileUtils;

public class AS400FileUtil {

	public static List<String> readDataListFromFile(String fileName) {
		BufferedReader in = null;
		String str = null;
		List<String> dataList = new ArrayList<String>();

		try {
			InputStream inputStream = FileUtils.class.getClassLoader().getResourceAsStream(fileName);
			in = new BufferedReader(new InputStreamReader(inputStream));
			while ((str = in.readLine()) != null) {
				dataList.add(str);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found" + fileName);
		} catch (IOException e) {
			System.out.println("Error while closing the file" + fileName);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("Error while closing the file" + fileName);
				}
			}
		}

		return dataList;

	}

}
