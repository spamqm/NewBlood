package tests.users;

import org.openqa.selenium.By;
import tests.TestBase;
import tests.testAble;

import static locators.userLocators.userLocators.*;


public class InviteUser extends TestBase implements testAble {
    public void testInviteUser() {

        testLogin();
        myTimeOut();

        openPage();

        enterUser("Greg1", "Kover1", "somemail@acacsac.com");

        save();

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

    }
}
