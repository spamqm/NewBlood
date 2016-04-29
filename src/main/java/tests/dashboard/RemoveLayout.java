package tests.dashboard;

import org.openqa.selenium.By;
import tests.TestBase;
import tests.testAble;

import static locators.dashboardLocators.DashboardLayoutsLoc.*;

public class RemoveLayout extends TestBase implements testAble {

    public RemoveLayout() {
        super();
    }

    public RemoveLayout(String mainURL) {
        super(mainURL);
    }

    public RemoveLayout(String mainURL, String profile) {
        super(mainURL, profile);
    }

    public void testRemoveLayout(String layoutName) {

        testLogin("gregoryk", "gregory82");


        log("\n________ REMOVE DASHBOARD LAYOUT");
        wd.get(getMainUrl() + DASHBOARD_LAYOUTS_PAGE.get());
        log("Open dashboard layouts page");

        wd.findElement(By.xpath(REMOVE_LAYOUT_CHECKBOX.replace(layoutName))).click();
        log("Select : " + layoutName + " project for removing");

        wd.findElement(By.xpath(BUTTON_DELETE.get())).click();
        log("Click on [Delete]");

        wd.findElement(By.xpath(BUTTON_DELETE_SELECTED_OK.get())).click();
        log("Click on [OK]");


    }

}
