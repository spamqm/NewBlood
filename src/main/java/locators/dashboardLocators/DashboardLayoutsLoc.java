package locators.dashboardLocators;

import locators.element;

public enum DashboardLayoutsLoc implements element {
    DASHBOARD_LAYOUTS_PAGE("/admin/Layouts.epage?sp=Sdash"),

    //Dashboard Table


    REMOVE_LAYOUT_CHECKBOX("//a[text()='" + LOCATOR_REPLACE_PATTERN +
            "']/following::input[1]"),

    ADD_NEW_BTN_XP("//*[@value='Add New']"),

    //Step 1
    DASH_LAYOUT_NAME_BOX("DashLayoutName"),
    DASH_LAYOUT_DESCRIPTION("DashLayoutDescription"),
    CONTINUE_BTN_XP("//*[@value='Continue...']"),

    //Step 2
    COLUMN_MENU_VALUE_1_XP("//select[@name=\"Palette_avail\"]/option[1]"),
    COLUMN_MENU_VALUE_2_XP("//select[@name=\"Palette_avail\"]/option[2]"),
    ARROW_RIGHT("//img[@name=\"Palette_selectImage\"]"),

    //Navigation
    FINISH_SAVE_CHANGES_BTN_XP("//input[@value=\"Finish & Save Changes\"]");

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


