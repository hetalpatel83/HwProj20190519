package Project20190519;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Project20190519.Utils.LongTimeStamp;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    //   static  String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(Date());

    @Before
    public void setUpBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get("http://demo.nopcommerce.com/");
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
                File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(source, new File("./CaptureScreenshots/" + scenario.getName() + ".png"));
                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {
                System.out.println(("Exception while taking screenshot" + e.getMessage()));
                //String screenshotName = scenario.getName().replaceAll()
            }
           // driver.close();
        }
    }
}
