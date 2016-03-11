
import tests.Login;
import tests.dashboard.CreateNewLayout;
import tests.testRail.TestRail;

public class Starter {
    public static void main(String[] args) throws Exception {

        String branch_15 = "http://lax1qapp02.cinteractive.com:8080/quicktest15/";

        //new CreateNewLayout("FF", branch_15).testCreateNewLayout();

        //   new Login("FF","http://koverqm.narod.ru").testLogin();

        //    new TestRail(20, "FF", "").testTestRail().finish();

        new TestRail().testTestRail().finish();

    }
}
