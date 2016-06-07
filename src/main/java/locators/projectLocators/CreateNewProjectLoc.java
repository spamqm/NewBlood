package locators.projectLocators;

import locators.element;


public enum CreateNewProjectLoc implements element {

    //STEP 1

    CREATE_NEW_PROJECT_PAGE("/project/CreateWork.epage"),
    CREATE_NEW_PROJECT_PAGE_OTHER(CREATE_NEW_PROJECT_PAGE.locator + "?sp=ScreateOtherWork"),
    WORK_TYPE_NAME("//option[contains(text(),'Work')]"),
    NEXT_BTN_ID("next"),

    //STEP 2


    NAME_ID("name"),
    LOCATION("//*[@id='popup_parentShow']"),

    LOCATION_SEARCH_TAB("//div[@class='dlgSearchBrowse']//*[text()='Search']"),
    LOCATION_SEARCH_FIND_ID("inputBoxId_parent"),
    LOCATION_SEARCH_TAB_WORK_ITEM("//div[@id='searchTab_popup_parentShow']//div[text()='Gregory']"),
    LOCATION_GO("//input[@value='Go']"),

    OBJECTIVE_ID("objective"),
    FINISH_BTN_ID("finish"),
    CREATE_AS_COMPLETED_YES("//th[contains(.,'Create')]/following::input[1]"),
    CREATE_AS_COMPLETED_NO("//th[contains(.,'Create')]/following::input[2]"),
    REDBOX("//div[@class='MsgBox RedBoxBorder']"),

    TAG("//th[contains(.,'000002')]/following::input[1]"),

    //STEP 3

    STATUS_ID("status"),
    PRIORITY("prioritySelect");


    private String locator;

    CreateNewProjectLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String get() {
        return locator;
    }
}
