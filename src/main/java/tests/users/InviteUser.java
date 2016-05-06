package tests.users;

import org.openqa.selenium.By;
import tests.TestBase;
import tests.testAble;

import static locators.userLocators.userLocators.*;


public class InviteUser extends TestBase implements testAble {


    public InviteUser() {
    }

    public InviteUser(String mainURL) {
        super(mainURL);
    }

    public InviteUser(String mainURL, String profile) {
        super(mainURL, profile);
    }

    public void testInviteUser() {


        testLogin();
        myTimeOut();

        openPage();

        enterUser("Greg1", "Kover1", "somemail@acacsac.com");

        save();

        if (checkProfile()) {
            log("Profile is created successfully");
        } else {
        }
        log("!!! Profile is not created");


    }

    @Override
    public void openPage() {

        log("Invite new user page opens");
        wd.get(getMainUrl() + INVITE_USER_PAGE.get());

    }

    @Override
    public void save() {
        wd.findElement(By.id(BTN_INVITE.get())).click();

    }

    public void enterUser() {
        enterUser("firstname1", "lastname1", "email@email.com");
    }

    public void enterUser(String firstName, String lastName, String email) {
        wd.findElement(By.id(FIELD_FIRST_NAME.get())).sendKeys(firstName);
        wd.findElement(By.id(FIELD_LAST_NAME.get())).sendKeys(lastName);
        wd.findElement(By.id(FIELD_EMAIL.get())).sendKeys(email);

        if (isElementPresent(By.id(FIELD_USERNAME.get()))) {
            wd.findElement(By.id(FIELD_USERNAME.get())).sendKeys(firstName);
        } else {
            log("UserName is not available");
        }

    }

    public boolean checkProfile() {
        return isElementPresent(By.xpath(NEW_PROFILE.get()));

    }
}