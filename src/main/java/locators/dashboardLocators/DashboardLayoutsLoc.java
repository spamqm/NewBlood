package locators.dashboardLocators;

import locators.element;

public enum DashboardLayoutsLoc implements element {
    DASHBOARD_LAYOUTS_PAGE("/admin/Layouts.epage?sp=Sdash"),

    //Dashboard Table


    REMOVE_LAYOUT_CHECKBOX("//a[text()='" + LOCATOR_REPLACE_PATTERN +
            "']/following::input[1]"),

    BUTTON_DELETE_SELECTED_OK("//div[@id='uid']//input[@value='Ok']"),
    BUTTON_DELETE_SELECTED_CANCEL("//input[@value='Cancel']"),
    BUTTON_DELETE("//input[@value='Delete' and @id='uidShow']"),


    BUTTON_ADD_NEW("//*[@value='Add New']"),

    //Step 1
    DASH_LAYOUT_NAME_BOX("DashLayoutName"),
    DASH_LAYOUT_DESCRIPTION("DashLayoutDescription"),
    BUTTON_CONTINUE("//*[@value='Continue...']"),

    //Step 2
    MENU_COLUMN_VALUE_1("//select[@name=\"Palette_avail\"]/option[1]"),
    MENU_COLUMN_VALUE_2("//select[@name=\"Palette_avail\"]/option[2]"),
    ARROW_RIGHT("//img[@name=\"Palette_selectImage\"]"),

    //Navigation
    BUTTON_FINISH_SAVE_CHANGES("//input[@value=\"Finish & Save Changes\"]");

    private String locator;
    private int position;

    DashboardLayoutsLoc(String locator) {
        this.locator = locator;
    }

    DashboardLayoutsLoc(String loc1, String loc2) {
        this.locator = loc1;

    }


    public String get() {
        return locator;
    }

    public String replace(String rep) {
        return locator.replace(LOCATOR_REPLACE_PATTERN, rep);
    }
}


