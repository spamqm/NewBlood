package tests.project;

import org.openqa.selenium.By;
import locators.projectLocators.CreateNewProjectLoc;
import tests.TestBase;

/**
 * Created by Gregory on 14.04.2016.
 */
public class CreateNewProject extends TestBase {
    public CreateNewProject(String profileURL) {
        super(profileURL);
    }

    public CreateNewProject(String profileURL, String browser, String mainURL) {
        super(profileURL, browser, mainURL);
    }

    public void testCreateNewProject() {


        wd.get(CreateNewProjectLoc.CREATE_NEW_PROJECT_PAGE.get());

        wd.findElement(By.id(CreateNewProjectLoc.WORK_TYPE_MENU_ID.get())).click();
        wd.findElement(By.xpath(CreateNewProjectLoc.WORK_TYPE_NAME.get())).click();

        wd.findElement(By.id(CreateNewProjectLoc.NEXT_BTN_ID.get())).click();

    }


}
