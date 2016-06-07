import tests.Login;
import tests.dashboard.CreateNewLayout;
import tests.dashboard.RemoveLayout;
import tests.project.CreateNewProject;
import tests.project.RemoveProject;
import tests.reportWizard.CreateReportWizard;
import tests.users.InviteUser;

public class UpgradeTest {
    public static void main(String[] args) {

        String LVHN = "https://relengxl.psteering.com/LVHN";

        Login test00 = new Login(LVHN);
        test00.testLogin("gregoryk", "gregory82");
        test00.finish();

        InviteUser test01 = new InviteUser(LVHN);
        test01.testInviteUser();
        test01.finish();

        CreateNewProject test02 = new CreateNewProject(LVHN);
        test02.testCreateNewProject();
        test02.finish();

        RemoveProject test03 = new RemoveProject(LVHN);
        test03.testRemoveProject(test02.getCurrentProject());
        test03.finish();

        CreateNewLayout test04 = new CreateNewLayout(LVHN);
        test04.testCreateNewLayout();
        test04.finish();

        RemoveLayout test05 = new RemoveLayout(LVHN);
        test05.testRemoveLayout(test04.getCurrentlayout());
        test05.finish();

        CreateReportWizard test06 = new CreateReportWizard(LVHN);
        test06.testCreateReport();
        test06.finish();


    }
}
