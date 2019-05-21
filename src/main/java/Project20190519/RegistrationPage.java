package Project20190519;

import org.openqa.selenium.By;

import static Project20190519.Utils.*;

public class RegistrationPage extends Utils {
    LoadProperties loadProperties = new LoadProperties();


    private By _register = By.linkText("Register");
    private By _gender = By.id("gender-male");
    private By _firstname = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private By _birthDay = By.xpath("//select[@name='DateOfBirthDay']");
    private By _birthmonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _birthyear = By.xpath("//select[@name='DateOfBirthYear']");
    private By _email = By.xpath("//input[@id='Email']");
    private By _password = By.xpath(" //input[@id='Password']");
    private By _confirmpassword = By.xpath("//input[@id='ConfirmPassword']");
    private By _registerbtn =  By.id("register-button");

    public void userEnterAllDetailsForRegistration(){

        clickElementBy(_register);
        clickElementBy(_gender);
        enterText(_firstname,loadProperties.getProperty("firstname"));
        enterText(_lastname,loadProperties.getProperty("lastname"));
        selectByValue(_birthDay,loadProperties.getProperty("DOBDate"));
        selectByValue(_birthmonth,loadProperties.getProperty("DOBMonth"));
        selectByValue(_birthyear,loadProperties.getProperty("DOBYear"));
        enterText(_email,LongTimeStamp() + loadProperties.getProperty("email"));
        enterText(_password,loadProperties.getProperty("password"));
        enterText(_confirmpassword,loadProperties.getProperty("confirmpassword"));
        clickElementBy(_registerbtn);


    }

}
