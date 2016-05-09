import tests.project.CreateNewProject;
import tests.project.RemoveProject;
import tests.timesheets.CreateTimesheets;
import tests.users.InviteUser;


public class Starter {
    public static void main(String[] args) throws Exception {


        String v15b = "http://lax1qapp02.cinteractive.com:8080/quicktest15";
        String v12 = "http://10.90.27.8:8080/qa_blank_12";
        String trunk = "http://lax1qapp05.cinteractive.com:8080/quicktest";

        /*CreateTimesheets timesheets = new CreateTimesheets();
        timesheets.testCreateTimesheets();
        timesheets.finish();*/

        CreateNewProject project = new CreateNewProject(v12);
        project.testCreateNewProject();
        project.finish();

        RemoveProject removeproject = new RemoveProject(v12);
        removeproject.testRemoveProject(project.getCurrentProject());
        removeproject.finish();
    }
}
