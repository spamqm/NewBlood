package locators;

/**
 * Created by Gregory on 15.04.2016.
 */
public enum Pages implements element {
    SEARCH_ADVANCED_PAGE("/search/advanced/ASOther.epage"),;

    private String locator;

    @Override
    public String get() {
        return locator;
    }

    Pages(String locator) {
        this.locator = locator;
    }
}
