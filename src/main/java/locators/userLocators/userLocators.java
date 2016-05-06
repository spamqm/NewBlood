package locators.userLocators;

import locators.element;

public enum userLocators implements element {
    INVITE_USER_PAGE("/InviteNewUser.epage"),
    FIELD_FIRST_NAME("firstName"),
    FIELD_LAST_NAME("lastName"),
    FIELD_EMAIL("email"),
    FIELD_USERNAME("userName"),

    BTN_INVITE("SubmitButton");

    String loc;

    userLocators(String loc) {

        this.loc = loc;
    }

    @Override
    public String get() {
        return loc;
    }
}
