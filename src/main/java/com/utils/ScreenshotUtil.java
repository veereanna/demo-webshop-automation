package com.utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.genericlibrary.BaseTest;

public class ScreenshotUtil {

	public static String takeScreenshot(String testName) {
		String path = getFilePath(testName);
		TakesScreenshot ts = (TakesScreenshot) BaseTest.drivers.get();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File(path);

		try {
			FileHandler.copy(src, tgt);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tgt.getAbsolutePath();
	}

	private static String getFilePath(String testName) {
		String dataTime = LocalDateTime.now().withNano(0).toString().replaceAll("[^a-zA-Z0-9]", "");
		String fileName = testName + "_" + dataTime + ".png";
		String path = "Screenshots/" + fileName;
		return path;

	}

}
