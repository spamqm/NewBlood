package locators.projectLocators;

import locators.element;

/**
 * Created by Gregory on 14.04.2016.
 */
public enum CreateNewProjectLoc implements element {

    //STEP 1

    CREATE_NEW_PROJECT_PAGE("/project/CreateWork.epage"),
    WORK_TYPE_MENU_ID("workType"),
    WORK_TYPE_NAME("//option[contains(text(),'GK Goal')]"),
    NEXT_BTN_ID("next"),

    //STEP 2

    NAME_ID("name"),
    OBJECTIVE_ID("objective"),
    FINISH_BTN_ID("finish"),

    //STEP 3

    STATUS_ID("status"),
    PRIORITY("prioritySelect")
    ;


    private String locator;

    CreateNewProjectLoc(String locator) {
        this.locator = locator;
    }

    @Override
    public String get() {
        return null;
    }
}
