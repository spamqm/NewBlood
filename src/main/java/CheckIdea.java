import locators.dashboardLocators.DashboardLayoutsLoc;

public class CheckIdea {
    public static void main(String[] args) {

        String changed = DashboardLayoutsLoc.REMOVE_LAYOUT_CHECKBOX.replace("PROJECT");
        log(changed);

    }

    public static void log(String str) {
        System.out.println(str);

    }
}
