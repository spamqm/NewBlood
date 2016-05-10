package tests.project;

import org.openqa.selenium.By;
import tests.TestBase;
import tests.testAble;

import static locators.HomePage.*;
import static locators.projectLocators.Project.*;

public class RemoveProject extends TestBase implements testAble {

    // project name
    String projectName;

    public RemoveProject() {
    }

    public RemoveProject(String mainURL) {
        super(mainURL);
    }

    public RemoveProject(String mainURL, String profile) {
        super(mainURL, profile);
    }

    public void testRemoveProject(String projectName) {
        this.projectName = projectName;

        testLogin();

        openPage();


        if (checkDelete()) {
            log("Project is removed from the system");
        } else {
            log("Project is NOT removed");
        }


    }

    public void testRemoveAllProjects(String projectName) {
        this.projectName = projectName;


    }

    private boolean checkDelete() {
        return isElementPresent(By.xpath(MESSAGE_PROJECT_DELETED.get()));

    }

    private void delete() {
        wd.findElement(By.id(OPTION_DELETE.get())).click();
        wd.findElement(By.xpath(BTN_DELETE.get())).click();
    }

    @Override
    // open project
    public void openPage() {
        log("#### Open project" + this.projectName);
        log("Click on Simple Search button");
        wd.findElement(By.id(SEARCH_QUICK_BTN.get())).click();
        log("Enter the project name");
        wd.findElement(By.id(SEARCH_QUICK_FIELD.get())).sendKeys(projectName);
        log("Open project");

        if (isElementPresent(By.xpath(SEARCH_PROJECT.replace(projectName)))) {
            wd.findElement(By.xpath(SEARCH_PROJECT.replace(projectName))).click();
            delete();
        } else {
            log("Project " + projectName + " is not found");
        }
    }

    @Override
    public void save() {

    }


}
