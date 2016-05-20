package locators;

public enum HomePage implements element {
    SEARCH_ADVANCED_PAGE("/search/advanced/ASOther.epage"),
    SEARCH_QUICK_BTN("searchIcon"),
    SEARCH_QUICK_FIELD("qs_searchText"),
    SEARCH_PROJECT("//li[@title='" + LOCATOR_REPLACE_PATTERN + "']"
    ),

    // ADD

    ADD("//a[@title='Add']"),
    ADD_REPORT("//div[@title='Report']"),
    ADD_REPORT_RW("//div[@id='ps_report_wizard']"),;

    private String loc;

    @Override
    public String get() {
        return loc;
    }

    HomePage(String loc) {
        this.loc = loc;
    }

    public String replace(String rep) {
        return loc.replace(LOCATOR_REPLACE_PATTERN, rep);
    }
}
