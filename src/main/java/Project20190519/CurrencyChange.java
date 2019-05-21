package Project20190519;

import org.openqa.selenium.By;

public class CurrencyChange extends Utils
{
    LoadProperties loadProperties = new LoadProperties();

    private By _currency = By.xpath("//select[@id='customerCurrency']");
    private By _euro = By.xpath("//select[@id='customerCurrency']");
    private By _dollar = By.xpath("//select[@id='customerCurrency']");

    public void userIsAbleToChangeCurrency()
    {
        //click on currency button
        clickElementBy(_currency);

        //select Euro
        selectByText(_euro,"Euro");

        //select Dollar
        selectByText(_dollar,"US Dollar");

        {System.out.println("all items are in US Dollars");
        }

    }
}
