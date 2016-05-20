package tests.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.TestBase;
import tests.testAble;

import java.util.List;

import static locators.projectLocators.CreateNewProjectLoc.*;


public class CreateNewProject extends TestBase implements testAble {

    public CreateNewProject() {
    }

    public CreateNewProject(String mainURL) {
        super(mainURL);
    }

    public CreateNewProject(String mainURL, String profile) {
        super(mainURL, profile);
    }

    private static String currentProject;

    public void testCreateNewProject() throws Exception {
//Setup
        setProject();
        testLogin("gregoryk", "gregory82");
        myTimeOut();


        wd.get(getMainUrl() + CREATE_NEW_PROJECT_PAGE.get());

//Step 1

        wd.findElement(By.xpath(WORK_TYPE_NAME.get())).click(); //Select work type
        log(" Select work item");


        wd.findElement(By.id(NEXT_BTN_ID.get())).click(); //Click on Next buttons
        log("click on the [Next button]");
//Step 2
        wd.findElement(By.id(NAME_ID.get())).sendKeys(getCurrentProject()); //Name
        log("Project name: " + getCurrentProject());
        // wd.findElement(By.id(CreateNewProjectLoc.OBJECTIVE_ID.get())).sendKeys("Description" + getCurrentProject());

        // Location

        wd.findElement(By.xpath(LOCATION.get())).click(); // Open Location window
        wd.findElement(By.xpath(LOCATION_SEARCH_TAB.get())).click(); // Go to Search tab
        wd.findElement(By.id(LOCATION_SEARCH_FIND_ID.get())).sendKeys("Gregory");
        wd.findElement(By.xpath(LOCATION_GO.get())).click(); // Click on Go


        if (isElementPresent(By.xpath(LOCATION_SEARCH_TAB_WORK_ITEM.get()))) {
            log("Element is present: " + LOCATION_SEARCH_TAB_WORK_ITEM.get());
        }


        wd.findElement(By.xpath(LOCATION_SEARCH_TAB_WORK_ITEM.get())).click(); //Select work item
        log("Location is selected");

        // Select tags
        //Finish
        wd.findElement(By.id(FINISH_BTN_ID.get())).click();

        // Check warnings
        // checkWarnings();


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

    public void checkWorkTree(String projectName) {


    }

    public void checkWarnings() {

        if (isElementPresent(By.xpath(REDBOX.get()))) {
            List<WebElement> we = wd.findElements(By.xpath(REDBOX.get()));
            for (int i = 0; i < we.size(); i++) {
                String temp = we.get(i).getText();

                log("####### " + getTag(temp));

                wd.findElement(By.xpath("//th[contains(.,'" + getTag(temp) + "')]/following::input[1]")).sendKeys("1234");
            }
            wd.findElement(By.id(FINISH_BTN_ID.get())).click();

        }
    }


    @Override
    public void openPage() {

    }


}


