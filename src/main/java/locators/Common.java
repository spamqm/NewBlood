package locators;

public enum Common implements element {
    SEARCH_ADVANCED_PAGE("/search/advanced/ASOther.epage"),
    SEARCH_QUICK_BTN("searchIcon"),
    SEARCH_QUICK_FIELD("qs_searchText"),
    SEARCH_PROJECT("//li[@title='" + LOCATOR_REPLACE_PATTERN + "']"
    ),

    // ADD

    ADD("//a[@title='Add']"),
    ADD_REPORT("//div[@title='Report']"),
    ADD_REPORT_RW("//div[@id='ps_report_wizard']"),

    // Select work
    //Tabs
    SELECT_WORK_TAB_MY_WORKS("//span[@class='tabLabel' and text()='My Works']"),
    SELECT_WORK_TAB_FAVORITES("//span[@class='tabLabel' and text()='Favorites']"),
    SELECT_WORK_TAB_BROWSE("//span[@class='tabLabel' and text()='Browse']"),
    SELECT_WORK_TAB_SEARCH("//span[@class='tabLabel' and text()='Search']"),


    //Search tab

    //span[@class='tabLabel' and text()='Search']
    //Browse tab
    //My work tab
    //Favourite tab
    ;

    private String loc;

    @Override
    public String get() {
        return loc;
    }

    Common(String loc) {
        this.loc = loc;
    }

    public String replace(String rep) {
        return loc.replace(LOCATOR_REPLACE_PATTERN, rep);
    }
}
