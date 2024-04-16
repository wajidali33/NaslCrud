package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageLocators {
    private WebDriver driver;

    // Locators
    private  String USERNAME_NAME= "username";
    private String PASSWORD_NAME= "password";
    private  String LOGIBUTTON_NAME= "loginBtn";

    // Constructor
    public LoginpageLocators(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to return WebElements

    public WebElement getUsernameInput() {
        return driver.findElement(By.name(USERNAME_NAME));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.name(PASSWORD_NAME));
    }



    public WebElement getLoginButton() {
        return driver.findElement(By.name(LOGIBUTTON_NAME));
    }
}
