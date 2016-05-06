package locators.userLocators;

import locators.element;

public enum userLocators implements element {
    INVITE_USER_PAGE("/InviteNewUser.epage"),
    FIELD_FIRST_NAME("firstName"),
    FIELD_LAST_NAME("lastName"),
    FIELD_EMAIL("email"),
    FIELD_USERNAME("UserNameTextField"),
    NEW_PROFILE("//div[@class='MsgBox BlueBoxBorder']//strong/div"),

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
