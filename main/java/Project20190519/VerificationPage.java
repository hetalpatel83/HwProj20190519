package Project20190519;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Project20190519.Utils.*;

public class VerificationPage {
    private LoadProperties loadProperties;

    public void registrationConfirmation()
    {
        getActualText(By.xpath("//div[@class='result']"));
        //User should be able to see the message "Your registration completed" if successful
        validation("Your registration completed");
        //Print Results
        System.out.println(actualResult);
    }


        public void userCanSeeThatItemCurrencyAreChanged(){

            //verify currency of all items are dollar or not
            boolean present = false;
            List<WebElement> activeList = driver.findElements(By.className("actual-price"));

            for (WebElement element : activeList)
            {
                String str = element.getText();

                for (int i = 0; i < str.length(); i++)
                {
                    char ch = str.charAt(i);
                    if (ch == '$')
                    {
                        present = true;
                        //index = i;
                    }
                }
                if (present == true)
                {
                    System.out.println("$" + " is present in the array list");
                    // break;
                } else
                    {
                    System.out.println("The $ is not present at the array list");
                }
            }


        }
    }
