package tests.timesheets;

import org.openqa.selenium.By;
import tests.TestBase;
import tests.testAble;


import static locators.timesheetsLocators.TimesheetsPageLocators.*;

public class CreateTimesheets extends TestBase implements testAble, timeSheetValues {

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

        log("Open the TimeSheets page");
        openPage();

        log("Select work item");
        selectWorkItem();


        log("Charge table with data");
        chargeDay(0, MON, "1");
        chargeDay(0, TUE, "2");
        chargeDay(0, WED, "3");
        chargeDay(0, THU, "4");
        chargeDay(0, FRI, "5");


        log("Enter description");

        for (int i = 0; i < 4; i++) {
            selectDescription(i, "Description" + i);
            log("Description " + i);

        }

        log("Save & Submit");
        saveAndSubmit();


        log("Open the Manage Time page");


        log("Check data");


    }

    public void openPage() {

        wd.findElement(By.xpath(MENU_PROFILE.get())).click();
        wd.findElement(By.xpath(TIMESHETS_PAGE.get())).click();
    }

    public void save() {
        wd.findElement(By.xpath(BUTTON_SAVE.get())).click();
    }

    protected void saveAndSubmit() {
        wd.findElement(By.xpath((BUTTON_SAVE_SUBMIT.get()))).click();
    }

    protected void selectWorkItem() {
        selectWorkItem(0, "Gregory");
    }

    protected void selectWorkItem(int i, String name) {
        wd.findElement(By.xpath(WORK_ITEM_EDITABLE.replace(i))).click();

        log("1 - SELECTOR opens");
        wd.findElement(By.xpath(TAB_BROWSE.get())).click();
        log("2 - BROWSE tab is selected");

        wd.findElement(By.xpath(TAB_BROWSE_WORK_ITEM.replace(name))).click();
        log("3 - WORK_ITEM is selected");
    }

    private void selectDescription(int i, String description) {
        wd.findElement(By.xpath(BUTTON_DESCRIPTION.replace(i))).click();
        wd.findElement(By.xpath(BUTTON_DESCRIPTION_TEXT.replace(i))).sendKeys(description);
        wd.findElement(By.xpath(BUTTON_DESCRIPTION_CLOSE.get())).click();

    }


    protected void chargeDay(int line, int day, String hour) {

        wd.findElement(By.xpath(TIME_SHEET_TABLE_CELL_EDITABLE.replace(line, day))).sendKeys(hour);
    }

}
