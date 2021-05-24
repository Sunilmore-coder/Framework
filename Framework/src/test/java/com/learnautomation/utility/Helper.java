package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	// Screenshot, iframe, alerts, windows, sync issue, javascript executor

	public static void CaptureScreenShot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(src, new File("./Screenshots/FreeCRM_" + GetcurrentdateTime() + ".png"));
			System.out.println("Screenshot Captured");

		} catch (IOException e) {
			System.out.println("Unable to capture the screenshot" + e.getMessage());
		}

	}

	public static String GetcurrentdateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}

}
