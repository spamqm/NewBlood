package locators.testRailLocators;

import locators.element;

public enum TestRailLocator implements element {


    TESTRAIL_MAIN_PAGE("https://upland.testrail.com/"),
    DASHBOARD_CUSTOM_FIELD_CHECKBOX_V15("https://upland.testrail.com/index.php?/tests/view/5681561"),
    TEST_RUN("https://upland.testrail.com/index.php?/runs/view/3691"),


    STATUS_MENU("//td[@class='js-status']/a[text()=\"Untested\"]"),
    STATUS_MENU_PASSED("//div[@id='statusDropdown']//a[text()='Passed']"),

    // login page locator

    NAME_ID("name"), NAME("gkoverdyaev@pragmaticsoft.com"),
    PASSWORD_ID("password"), PASSWORD("GregPek8369"),
    LOGIN_SUBMIT_BTN_XP("//button[@type='submit']"),

    // test case page locator
    ADD_RESULT_BTN_ID("addResult"),
    ELAPSED_BOX_ID("addResultElapsed"),

    ADD_RESULT_SUBMIT_BTN_ID("addResultSubmit"),
    //NEXT_CASE_BUTTON(".//*[@id='directionNext']");

    NEXT_CASE_BUTTON("//img[contains(@src,'https://static.testrail.com/5.2.0.3447/images/direction/next.png')]");

    private String locator;

    TestRailLocator(String locator) {
        this.locator = locator;
    }

    @Override
    public String get() {
        return locator;
    }
}
