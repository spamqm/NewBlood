package tests.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import tests.TestBase;
import tests.testAble;

import static locators.dashboardLocators.DashboardLayoutsLoc.*;


public class CreateNewLayout extends TestBase implements testAble {

    private static String currentlayout;


    public CreateNewLayout() {
        super();
    }

    public CreateNewLayout(String mainURL) {
        super(mainURL);
    }

    public CreateNewLayout(String mainURL, String profile) {
        super(mainURL, profile);
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


        wd.get(getMainUrl() + DASHBOARD_LAYOUTS_PAGE.get());
        log("Open dash page");

        // add new button
        wd.findElement(By.xpath(BUTTON_ADD_NEW.get())).click();
        log("STEP 1");
        // Enter the name
        wd.findElement(By.id(DASH_LAYOUT_NAME_BOX.get())).clear();
        wd.findElement(By.id(DASH_LAYOUT_NAME_BOX.get())).sendKeys(getCurrentlayout());
        // Enter description
        wd.findElement(By.id(DASH_LAYOUT_DESCRIPTION.get())).sendKeys("");
        // Next Step 2
        wd.findElement(By.xpath(BUTTON_CONTINUE.get())).click();
        wd.findElement(By.xpath(BUTTON_CONTINUE.get())).click();


        log("Builder starts");
        log("STEP 2");
        new Actions(wd).keyDown(Keys.CONTROL)
                .click(wd.findElement(By.xpath(MENU_COLUMN_VALUE_1.get())))
                .click(wd.findElement(By.xpath(MENU_COLUMN_VALUE_2.get())))
                .keyUp(Keys.CONTROL).perform();

        log("Builder finishes");

// Save changes
        wd.findElement(By.xpath(BUTTON_FINISH_SAVE_CHANGES.get())).click();
        log("CLICK ON ---- " + BUTTON_FINISH_SAVE_CHANGES.get());


        // Delete current layout


        log("TEST completed");


    }

}
