package tests.dashboard;

import locators.dashboardLocators.DashboardLayoutsLoc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import tests.TestBase;


public class CreateNewLayout extends TestBase {


    public CreateNewLayout(String browser, String mainURL) {
        super(browser, mainURL);
    }

    /*public CreateNewLayout() {
        super();
    }*/

    @Test

    public void testCreateNewLayout() throws InterruptedException {

        myTimeOut();
        // Log in page
        testLogin("gregoryk", "gregory82");


        wd.get(wd.getCurrentUrl() + DashboardLayoutsLoc.DASHBOARD_LAYOUTS_PAGE.get());
        log("Open dash page");


        wd.findElement(By.xpath(DashboardLayoutsLoc.ADD_NEW_BTN_XP.get())).click();
        wd.findElement(By.id(DashboardLayoutsLoc.DASH_LAYOUT_NAME_BOX.get())).sendKeys("GK auto-" + Math.random());
        wd.findElement(By.xpath(DashboardLayoutsLoc.CONTINUE_BTN_XP.get())).click();
        wd.findElement(By.xpath(DashboardLayoutsLoc.CONTINUE_BTN_XP.get())).click();


        log("Builder starts");

        new Actions(wd).keyDown(Keys.CONTROL)
                .click(wd.findElement(By.xpath(DashboardLayoutsLoc.COLUMN_MENU_VALUE_1_XP.get())))
                .click(wd.findElement(By.xpath(DashboardLayoutsLoc.COLUMN_MENU_VALUE_2_XP.get())))
                .keyUp(Keys.CONTROL).perform();

        log("Builder finishes");


        wd.findElement(By.xpath(DashboardLayoutsLoc.FINISH_SAVE_CHANGES_BTN_XP.get())).click();


        log("CLICK ON ---- " + DashboardLayoutsLoc.FINISH_SAVE_CHANGES_BTN_XP.get());


    }

}
