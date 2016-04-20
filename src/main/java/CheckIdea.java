import locators.dashboardLocators.TimesheetsPageLocators;

public class CheckIdea {
    public static void main(String[] args) {
        String work_item_name = "GK projectLocators";
        String temp1 = TimesheetsPageLocators.REMOVE_LAYOUT_CHECKBOX.get();
        String temp2 = TimesheetsPageLocators.REMOVE_LAYOUT.get();
        String temp3;

        temp3 = "0123456789";

        //  log(temp1);

        //   log(temp2+"\n\n\n");

        log(temp3.substring(temp3.length() - 1));


    }

    public static void log(String str) {
        System.out.println(str);

    }
}
