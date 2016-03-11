package tests;


import locators.login.LoginLoc;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class TestBase {


    public WebDriver wd;


    private FirefoxProfile profile = new FirefoxProfile(new File("g:/greg-profile"));
    private String browser = "FF";
    private String mainURL = "";

    public TestBase() {

        // Start browser
        start();
    }


    public TestBase(String browser, String mainURL) {
        this.browser = browser;
        this.mainURL = mainURL;


        // Start browser
        start();

    }



    public void start() {


        profile.setPreference("","");


        if (browser == "FF") {
            wd = new FirefoxDriver(profile);
            wd.get(mainURL);
            log("MAIN URL === " + mainURL);


        } else {

            log("Wrong browser is entered");

        }
    }

    public void myTimeOut() {
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.
                SECONDS);
    }



    public void finish() {

        log("Browser is closed");
        wd.close();
    }

    public void log(String data) {

        // File screenshot = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        // screenshot.renameTo(new File("g:/screenshot1-" + data + ".png"));


        System.out.println(data);
    }


    // LOGIN



    public void testLogin(String username, String password) {

        wd.get(mainURL);
        log("Open: " + mainURL);


        wd.findElement(By.id(LoginLoc.LOCALE_SELECT_MENU.get())).click();
        wd.findElement(By.xpath(LoginLoc.LOCALE_ENGLISH.get())).click();
        log("Change locale");


        wd.findElement(By.id(LoginLoc.USER.get())).sendKeys(username);
        wd.findElement(By.id(LoginLoc.PASSWORD.get())).sendKeys(password);
        log("Enter Login & Password");


        wd.findElement(By.id(LoginLoc.SUBMIT_BTN.get())).click();
        log("Submit form");
    }


    /*public boolean isElementPresent(By by) {

        try {
            wd.findElement(by);
            return true;
        } catch (Exception e) {
            log("Element " + by + " is NOT found:");
            return false;
        }
    }


    public void oneMore() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://somedomain/url_that_delays_loading");
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<WebElement>() {
                    @Override
                    public WebElement apply(WebDriver d) {
                        return d.findElement(By.id("myDynamicElement"));
                    }
                });

    }*/
}
