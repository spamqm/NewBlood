package tests.dashboard;

import locators.dashboardLocators.DashboardLayoutsLoc;
import org.openqa.selenium.By;
import tests.TestBase;

public class RemoveLayout extends TestBase {
    public RemoveLayout(String profileURL) {
        super(profileURL);
    }

    public RemoveLayout(String profileURL, String browser, String mainURL) {
        super(profileURL, browser, mainURL);
    }

    public void testRemoveLayout(String layoutName) {


        log("\n________ REMOVE DASHBOARD LAYOUT");
        wd.get(getMainUrl() + DashboardLayoutsLoc.DASHBOARD_LAYOUTS_PAGE.get());
        log("Open dashboard layouts page");

        wd.findElement(By.xpath(DashboardLayoutsLoc.REMOVE_LAYOUT_CHECKBOX.replace(layoutName))).click();
        log("Select : " + layoutName + " project for removing");

        wd.findElement(By.xpath(DashboardLayoutsLoc.DELETE_BTN.get())).click();
        log("Click on [Delete]");

        wd.findElement(By.xpath(DashboardLayoutsLoc.DELETE_SELECTED_OK_BTN.get())).click();
        log("Click on [OK]");


    }

}
