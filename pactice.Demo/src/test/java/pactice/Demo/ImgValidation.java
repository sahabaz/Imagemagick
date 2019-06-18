package pactice.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pactice.Demo.BaseLib.BaseTest;
import ru.yandex.qatools.ashot.Screenshot;

public class ImgValidation extends BaseTest {

	    @Test
	    public void myAirtleImgaeValidation () throws Exception {

	        //Declare UZMAN photo section
	        WebElement myAirtlePhotoSection = driver.findElement(By.xpath("//div[@class='row airtelapp-wrapper']"));
	        //Wait for 2 second for violet color animation
	        Thread.sleep(2000);
	        //Take ScreenShot with AShot
	        Screenshot myAirtleScreenShot = takeScreenshot(myAirtlePhotoSection);

	        //Write actual screenshot to the actual screenshot path
	        writeScreenshotToFolder(myAirtleScreenShot);

	        //Do image comparison
	        doComparison(myAirtleScreenShot);
	    }

	    //Close Driver
	    @AfterClass
	    public void quitDriver() {
	        driver.quit();
	    }
	}
