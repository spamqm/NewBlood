package tests.testRail;


import locators.testRailLocators.*;
import org.openqa.selenium.By;
import tests.TestBase;

public class TestRail extends TestBase {


    // Locators;

    String mainPage = TestRailLocator.TESTRAIL_MAIN_PAGE.get();

    int cases = -1;

    public TestRail(int cases, String browser, String URL) {
        // Specified number of cases
        super(browser, URL);
        this.cases = cases;
    }

    public TestRail() {
        super();
    }


    public TestRail testTestRail() throws Exception {
        myTimeOut();
        log("======  Starting testRail testing  ======");

        wd.get(mainPage);
        log("Open the MAIN URL: " + mainPage);

       /* if (isElementPresent(By.id(TestRailLocator.NAME_ID.get()))) {
            WebElement name = wd.findElement(By.id(TestRailLocator.NAME_ID.get()));
            name.clear();
            name.sendKeys(TestRailLocator.NAME.get());
        } else return;*/


        wd.findElement(By.id(TestRailLocator.NAME_ID.get())).clear();
        wd.findElement(By.id(TestRailLocator.NAME_ID.get())).sendKeys(TestRailLocator.NAME.get());
        log("Enter name");
        wd.findElement(By.id(TestRailLocator.PASSWORD_ID.get())).sendKeys(TestRailLocator.PASSWORD.get());
        log("Enter password");
        wd.findElement(By.xpath(TestRailLocator.LOGIN_SUBMIT_BTN_XP.get())).click();
        log("Submit");


        for (int i = 0; ; i++) {

            try {
                wd.get(TestRailLocator.TEST_RUN.get());
                log("Current TEST RUN opens:  " + TestRailLocator.TEST_RUN.get());
                //   Thread.sleep(3000);

                wd.findElement(By.xpath(TestRailLocator.STATUS_MENU.get())).click();
                //   Thread.sleep(2000);
                wd.findElement(By.xpath(TestRailLocator.STATUS_MENU_PASSED.get())).click();
                //   Thread.sleep(2000);

                log("OPen menu and select PASSED");

                String elapsed = Integer.toString(1 + (int) (Math.random() * 20));
                wd.findElement(By.id(TestRailLocator.ELAPSED_BOX_ID.get())).sendKeys(elapsed);
                log("Elapsed time " + elapsed);

                //   Thread.sleep(2000);

                wd.findElement(By.id(TestRailLocator.ADD_RESULT_SUBMIT_BTN_ID.get())).click();
                log("Submit result");

                Thread.sleep(1000);
                log("pause");
                log("Step #" + i);
                if (i == cases) {
                    // If i == cases Test Run finishes
                    log("number of case passed ==== " + i);
                    log("======  TestRail test completed  ======");
                    return this;
                }


            } catch (Exception e) {
                // All cases are passed
                log("======  number of case passed ==== " + i);
                log("======  TestRail test completed  ======");
                return this;

            }
        }


    }


}
