package locators.projectLocators;

import locators.element;

public enum Project implements element {

    OPTION_DELETE("ps_work_delete"),
    BTN_DELETE("//div[text()='Delete Work']/following::div//input[@value='Delete']"),
    MESSAGE_PROJECT_DELETED("//div[@class='box padded']"),;
    private String locator;


    Project(String locator) {
        this.locator = locator;
    }

    @Override
    public String get() {
        return locator;
    }

    public String replace(String rep) {
        return locator.replace(LOCATOR_REPLACE_PATTERN, rep);
    }
}
