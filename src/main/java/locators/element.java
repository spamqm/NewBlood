package locators;

/**
 * Created by Gregory on 25.01.2016.
 */
public interface element {

    String LOCATOR_REPLACE_PATTERN = "{}";
    String LOCATOR_REPLACE_PATTERN_2 = "##";
    String LOCATOR_REPLACE_PATTERN_3 = "$$";
    String EMPTY = "";

    public String get();
}
