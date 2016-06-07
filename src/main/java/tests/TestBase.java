package tests;


import locators.login.LoginLoc;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class TestBase {


    public static WebDriver wd;
    private static boolean login = true;

    private String profile = "c:\\Develop\\Libs\\greg-profile";  //default profile
    private String browser = "FF";
    private String mainURL = "http://10.90.27.8:8080/qa_blank_12";

    public TestBase() {
        start();
    }

    public TestBase(String mainURL) {
        this.mainURL = mainURL;
        start();
    }

    public TestBase(String mainURL, String profile) {
        this.mainURL = mainURL;
        this.profile = profile;
    }

    public TestBase(String mainURL, String profile, String browser) {
        this.browser = browser;
        this.mainURL = mainURL;
        this.profile = profile;


        // Start browser
        start();

    }

    public String getMainUrl() {
        return mainURL;
    }

    public void start() {

        FirefoxProfile profile = new FirefoxProfile(new File(this.profile));

        profile.setPreference("", "");


        if (browser == "FF") {
            wd = new FirefoxDriver(profile);
            wd.get(mainURL);
            log("MAIN URL === " + mainURL + "\n");


        } else {

            log("Wrong browser is entered");

        }
    }

    public void myTimeOut() {
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.
                SECONDS);
    }

    public void myTimeOut(int time) {
        wd.manage().timeouts().implicitlyWait(time, TimeUnit.
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

    public void testLogin() {

        testLogin("gregoryk", "gregory82");
    }

    public void testLogin(String username, String password) {

        log("\ntestLogin is started");

        wd.get(mainURL);


        myTimeOut(1);

        if (isElementPresent(By.xpath(LoginLoc.LOGOUT.get()))) {

            // log("User is already logged in");
            return;

        } else {
// locale is not available
            if (isElementPresent(By.id(LoginLoc.LOCALE_SELECT_MENU.get()))) {

                wd.findElement(By.id(LoginLoc.LOCALE_SELECT_MENU.get())).click();
                wd.findElement(By.xpath(LoginLoc.LOCALE_ENGLISH.get())).click();
                log("Change locale");
            }
            myTimeOut();

            wd.findElement(By.id(LoginLoc.USER.get())).sendKeys(username);
            wd.findElement(By.id(LoginLoc.PASSWORD.get())).sendKeys(password);
            log("Enter Login & Password");


            wd.findElement(By.id(LoginLoc.SUBMIT_BTN.get())).click();
            log("Submit form");
        }
        log("testLogin is finished\n");

    }


    public void searchAndSelect(String project) {
        //click on Search tab
        //select Project
        //Apply changes

    }

    public boolean isElementPresent(By by) {

        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            // log("Element " + by + " is NOT found:");
            return false;
        }
    }

    public boolean isElementVisible(By by) {

        try {
            wd.findElement(by);
            return true;
        } catch (ElementNotVisibleException e) {
            log("Element " + by + " is NOT visible:");
            return false;
        }
    }

    public String getCurrentUser() {
        return "";
    }

    public void openHomePage() {

        wd.get(getMainUrl());
    }


/*
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
