package tests.dashboard;

import locators.dashboardLocators.DashboardLayoutsLoc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import tests.TestBase;


public class CreateNewLayout extends TestBase {

    private static String currentlayout;


    public CreateNewLayout(String profileURL, String browser, String mainURL) {
        super(profileURL, browser, mainURL);
    }

    public CreateNewLayout(String profileURL) {
        super(profileURL);
    }


    public void setCurrentLayout(String currentlayout) {
        this.currentlayout = currentlayout;
    }

    public String getCurrentlayout() {
        return currentlayout;
    }

    public void testCreateNewLayout() throws InterruptedException {

        // Generate a new layout name

        setCurrentLayout("GK auto - " + (int) (Math.random() * 1000000));

        myTimeOut();
        // Log in page
        testLogin("gregoryk", "gregory82");


        wd.get(getMainUrl() + DashboardLayoutsLoc.DASHBOARD_LAYOUTS_PAGE.get());
        log("Open dash page");

        // add new button
        wd.findElement(By.xpath(DashboardLayoutsLoc.ADD_NEW_BTN_XP.get())).click();
        log("STEP 1");
        // Enter the name
        wd.findElement(By.id(DashboardLayoutsLoc.DASH_LAYOUT_NAME_BOX.get())).clear();
        wd.findElement(By.id(DashboardLayoutsLoc.DASH_LAYOUT_NAME_BOX.get())).sendKeys(getCurrentlayout());
        // Enter description
        wd.findElement(By.id(DashboardLayoutsLoc.DASH_LAYOUT_DESCRIPTION.get())).sendKeys("");
        // Next Step 2
        wd.findElement(By.xpath(DashboardLayoutsLoc.CONTINUE_BTN_XP.get())).click();
        wd.findElement(By.xpath(DashboardLayoutsLoc.CONTINUE_BTN_XP.get())).click();


        log("Builder starts");
        log("STEP 2");
        new Actions(wd).keyDown(Keys.CONTROL)
                .click(wd.findElement(By.xpath(DashboardLayoutsLoc.COLUMN_MENU_VALUE_1_XP.get())))
                .click(wd.findElement(By.xpath(DashboardLayoutsLoc.COLUMN_MENU_VALUE_2_XP.get())))
                .keyUp(Keys.CONTROL).perform();

        log("Builder finishes");

// Save changes
        wd.findElement(By.xpath(DashboardLayoutsLoc.FINISH_SAVE_CHANGES_BTN_XP.get())).click();
        log("CLICK ON ---- " + DashboardLayoutsLoc.FINISH_SAVE_CHANGES_BTN_XP.get());


        // Delete current layout
        // open dashboard page
        wd.get(getMainUrl() + DashboardLayoutsLoc.DASHBOARD_LAYOUTS_PAGE.get());

        // find current layout





    }

}
