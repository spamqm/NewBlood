
import tests.Login;
import tests.dashboard.CreateNewLayout;
import tests.testRail.TestRail;

public class Starter {
    public static void main(String[] args) throws Exception {

        // profile example ---  G:/greg-profile

        String branch_15 = "http://lax1qapp02.cinteractive.com:8080/quicktest15";

        CreateNewLayout newItem = new CreateNewLayout(args[0], "FF", branch_15);
        newItem.testCreateNewLayout();
        newItem.finish();

        //   new Login("FF","http://koverqm.narod.ru").testLogin();

        //    new TestRail(20, "FF", "").testTestRail().finish();

        // new TestRail(args[0]).testTestRail().finish();

    }
}
