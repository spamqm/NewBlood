package tests.project;

import org.openqa.selenium.By;
import locators.projectLocators.CreateNewProjectLoc;
import org.openqa.selenium.WebElement;
import tests.TestBase;

import java.util.List;


public class CreateNewProject extends TestBase {


    private static String currentProject;

    public void testCreateNewProject() throws Exception {
//Setup
        setProject();
        testLogin("gregoryk", "gregory82");
        myTimeOut();


        wd.get(getMainUrl() + CreateNewProjectLoc.CREATE_NEW_PROJECT_PAGE.get());

//Step 1

        wd.findElement(By.xpath(CreateNewProjectLoc.WORK_TYPE_NAME.get())).click(); //Select work type
        log(" Select work item");


        wd.findElement(By.id(CreateNewProjectLoc.NEXT_BTN_ID.get())).click(); //Click on Next buttons
        log("click on the [Next button]");
//Step 2
        wd.findElement(By.id(CreateNewProjectLoc.NAME_ID.get())).sendKeys(getCurrentProject()); //Name
        log("Project name: " + getCurrentProject());
        // wd.findElement(By.id(CreateNewProjectLoc.OBJECTIVE_ID.get())).sendKeys("Description" + getCurrentProject());

        // Location

        wd.findElement(By.xpath(CreateNewProjectLoc.LOCATION.get())).click(); // Open Location window
        wd.findElement(By.xpath(CreateNewProjectLoc.LOCATION_SEARCH_TAB.get())).click(); // Go to Search tab
        wd.findElement(By.id(CreateNewProjectLoc.LOCATION_SEARCH_FIND_ID.get())).sendKeys("Gregory");
        wd.findElement(By.xpath(CreateNewProjectLoc.LOCATION_GO.get())).click(); // Click on Go


        if (isElementPresent(By.xpath(CreateNewProjectLoc.LOCATION_SEARCH_TAB_WORK_ITEM.get()))) {
            log("Element is present: " + CreateNewProjectLoc.LOCATION_SEARCH_TAB_WORK_ITEM.get());
        }


        wd.findElement(By.xpath(CreateNewProjectLoc.LOCATION_SEARCH_TAB_WORK_ITEM.get())).click(); //Select work item
        log("Location is selected");

        // Select tags
        //Finish
        wd.findElement(By.id(CreateNewProjectLoc.FINISH_BTN_ID.get())).click();

        // Check warnings
        if (isElementPresent(By.xpath(CreateNewProjectLoc.REDBOX.get()))) {
            List<WebElement> we = wd.findElements(By.xpath(CreateNewProjectLoc.REDBOX.get()));
            for (int i = 0; i < we.size(); i++) {
                String temp = we.get(i).getText();

                log("####### " + getTag(temp));

                wd.findElement(By.xpath("//th[contains(.,'" + getTag(temp) + "')]/following::input[1]")).sendKeys("1234");
            }
            wd.findElement(By.id(CreateNewProjectLoc.FINISH_BTN_ID.get())).click();

        }

    }

    public String getTag(String input) {
        String changed = input.replace("You must enter a value for ", "");
        return changed.substring(0, changed.length() - 1);
    }

    public void setProject() {
        currentProject = "GK - Auto Project - " + ((int) (Math.random() * 1000000));
    }

    public void setProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public void setWorkType() {

    }

    public void findProject() {


    }

    public String getCurrentProject() {
        return currentProject;
    }

    public CreateNewProject(String profileURL) {
        super(profileURL);
    }

    public CreateNewProject(String profileURL, String browser, String mainURL) {
        super(profileURL, browser, mainURL);
    }

}
