package Project20190519;

import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BrowserSelector
{
    //User is on homepage
    public void verifyUserIsOnHomePage()
    {
        getActualText(By.linkText("Log in"));
        Assert.assertEquals("Log in",actualResult);
        validation("Log in");
        System.out.println("User is on HomePage");

    }

}
