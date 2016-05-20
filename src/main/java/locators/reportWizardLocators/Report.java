package locators.reportWizardLocators;

import locators.element;


public enum Report implements element {


    // STEP 1 (Type)

    PAGE_SAVE_BUTTON("//input[@class='btn' and @value='Save']"),
    PAGE_CANCEL_BUTTON("//input[@value='Cancel' and @type='submit']"),
    PAGE_SAVE_AS_BUTTON("//input[@class='btn' and @value='Save as']"),
    PAGE_CONTINUE_BUTTON("//input[@class='btn' and contains(@value,'Continue')]"),
    PAGE_RUN_BUTTON("//input[@value='Run']"),

    // STEP 9 (Details & Schedule)

    REPORT_NAME("reportName"),
    REPORT_DESCRIPTION("TextArea");
    String loc;

    Report(String loc) {
        this.loc = loc;
    }

    @Override
    public String get() {
        return loc;
    }
}
