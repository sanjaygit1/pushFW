package Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp implements ITestListener {

public void onTestFailure(ITestResult result) {
		
		TakesScreenshot takesSceenShot = (TakesScreenshot)BaseClass.sdriver;
		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./FailesScripts.png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			
			e.printStackTrace();
		}}
}
