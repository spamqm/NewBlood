
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import tests.Login;
import tests.dashboard.CreateNewLayout;
import tests.dashboard.RemoveLayout;
import tests.testRail.TestRail;
import tests.project.CreateNewProject;

import java.io.File;

public class Starter {
    public static void main(String[] args) throws Exception {

        // profile example ---  G:/greg-profile

        String v15b = "http://lax1qapp02.cinteractive.com:8080/quicktest15";
        String v12 = "http://10.90.27.8:8080/qa_blank_12";
        String trunk = "http://lax1qapp05.cinteractive.com:8080/quicktest";

        CreateNewLayout newItem = new CreateNewLayout(args[0], "FF", v12);
        newItem.testCreateNewLayout();
        RemoveLayout newItem2 = new RemoveLayout(args[0], "FF", v12);
        newItem2.testRemoveLayout(newItem.getCurrentlayout());

        newItem.finish();
        newItem2.finish();


        //   new Login("FF","http://koverqm.narod.ru").testLogin();

        //    new TestRail(20, "FF", "").testTestRail().finish();

        // new TestRail(args[0]).testTestRail().finish();

        /*CreateNewProject createProject = new CreateNewProject(args[0], "FF", v15b);
        for (int i = 0; i < 9; i++) {
            createProject.testCreateNewProject();
        }
        createProject.finish();*/

    }
}
