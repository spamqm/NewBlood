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
        int i = 0;
        do {
            i++;
            testLogin();

            openPage();

            enterUser("Gregory" + i, "Kover" + i, i + "somemail@acacsac.com");

            save();
        } while (!checkProfile());
    }

    @Override
    public void openPage() {

        log("Invite new user page opens");
        wd.get(getMainUrl() + INVITE_USER_PAGE.get());

    }


    private void save() {
        wd.findElement(By.id(BTN_INVITE.get())).click();

    }

    private void enterUser() {
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
        myTimeOut(1);
        return isElementPresent(By.xpath(NEW_PROFILE.get()));

    }
}
