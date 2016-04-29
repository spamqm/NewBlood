package tests.timesheets;

import org.openqa.selenium.By;
import tests.TestBase;
import tests.testAble;

import static locators.timesheetsLocators.TimesheetsPageLocators.*;

public class CreateTimesheets extends TestBase implements testAble {

    public CreateTimesheets() {
    }

    public CreateTimesheets(String mainURL) {
        super(mainURL);
    }

    public CreateTimesheets(String mainURL, String profile) {
        super(mainURL, profile);
    }

    public void testCreateTimesheets() {

        String timeSheetsPage = TIMESHETS_PAGE.replace("");

        testLogin();
        myTimeOut();

        log("Open the HOME page");
        openHomePage();

        log("Open the Timesheets page");
        openPage();

        log("Select work item");
        selectWorkItem();


        log("Charge table with data");


        log("Enter description");


        log("Submit timesheets week");


        log("Open the Manage Time page");


        log("Check data");


    }

    protected void openPage() {

        wd.findElement(By.xpath(MENU_PROFILE.get())).click();
        wd.findElement(By.xpath(TIMESHETS_PAGE.get())).click();
    }

    protected void save() {
        wd.findElement(By.xpath(BUTTON_SAVE.get())).click();
    }

    protected void saveAndSubmit() {
        wd.findElement(By.xpath((BUTTON_SAVE_SUBMIT.get()))).click();
    }

    protected void selectWorkItem() {
        selectWorkItem(0);
    }

    protected void selectWorkItem(int i) {
        wd.findElement(By.xpath(WORK_ITEM_EDITABLE.replace(i))).click();
        wd.findElement(By.xpath(WORK_ITEM_EDITABLE.get())).click();
    }

    protected void chargeDay(int line, int day, String hour) {

        wd.findElement(By.xpath(TIME_SHEET_TABLE_CELL_EDITABLE.replace(line, day))).sendKeys(hour);
    }

}
