package locators.login;

import locators.element;

public enum LoginLoc implements element {

    HOME_PAGE("http://lax1qapp04.cinteractive.com:8080/quicktest_trunk"),
    // HOME_PAGE("http://google.com"),


    // IDs
    LOGOUT("//a[@id='LinkSubmit']"),

    LOCALE_SELECT_MENU("localeSelect"),
    LOCALE_ENGLISH("//a[@id='1']"),

    USER("loginField"),
    PASSWORD("passwordField"),
    SUBMIT_BTN("Submit_0");

    private String locator;

    LoginLoc(String locator) {
        this.locator = locator;
    }

    public String get() {
        return locator;
    }
}
