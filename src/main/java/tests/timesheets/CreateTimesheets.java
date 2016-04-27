package tests.timesheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.TestBase;
import tests.testAble;
import locators.timesheetsLocators.TimesheetsPageLocators;

public class CreateTimesheets extends TestBase implements testAble {


    public CreateTimesheets(String profileURL, WebDriver wd) {
        super(profileURL);
    }

    public CreateTimesheets(String profileURL, String browser, String mainURL) {
        super(profileURL, browser, mainURL);
    }

    public void testCreateTimesheets() {

        String timeSheetsPage = TimesheetsPageLocators.TIMESHETS_PAGE.replace("");

        testLogin("gregoryk", "gregory82");
        myTimeOut();

        log("Open the HOME page");


        log("Open the Timesheets page");
        wd.findElement(By.xpath(TimesheetsPageLocators.TIMESHETS_PAGE.get())).click();

        log("Open the work item menu");


        log("Charge table with data");


        log("Enter description");


        log("Submit timesheets week");


        log("Open the Manage Time page");


        log("Check data");


    }

    protected void openTimesheetsPage() {


    }

}
