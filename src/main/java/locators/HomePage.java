package locators;

public enum HomePage implements element {
    SEARCH_ADVANCED_PAGE("/search/advanced/ASOther.epage"),
    SEARCH_QUICK_BTN("searchIcon"),
    SEARCH_QUICK_FIELD("qs_searchText"),
    SEARCH_PROJECT("//li[@title='" + LOCATOR_REPLACE_PATTERN + "']"
    );

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
