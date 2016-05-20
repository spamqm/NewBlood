package tests.reportWizard;

import org.openqa.selenium.By;
import tests.TestBase;
import tests.testAble;

import static locators.HomePage.*;
import static locators.reportWizardLocators.Report.*;

public class CreateReportWizard extends TestBase implements testAble {

    private static String currentReport;


    public CreateReportWizard() {
    }

    public CreateReportWizard(String mainURL) {
        super(mainURL);
    }

    public CreateReportWizard(String mainURL, String profile) {
        super(mainURL, profile);
    }


    public void testCreateReport() {
        testCreateReport("GK Auto RW - " + ((int) (Math.random() * 100000)));
    }

    public void testCreateReport(String name) {
        currentReport = name;
        testLogin();
        log("Open Add Report Wizard page");
        openPage();
        log("Continue");
        next();
        log("Save");
        save();

        log("STEP 9");
        step9();
        log("Save");
        save();
    }

    @Override
    public void openPage() {
        log("Add");
        wd.findElement(By.xpath(ADD.get())).click();
        log("Add >> Report");
        wd.findElement(By.xpath(ADD_REPORT.get())).click();
        log("Add >> Report >> RW");
        wd.findElement(By.xpath(ADD_REPORT_RW.get())).click();

    }

    private void step1() {

        log("Type selection");
        next();


    }

    private void step9() {

        log("Report Name: " + currentReport);
        wd.findElement(By.id(REPORT_NAME.get())).clear();
        wd.findElement(By.id(REPORT_NAME.get())).sendKeys(currentReport);

        log("Description");
        wd.findElement(By.id(REPORT_DESCRIPTION.get())).sendKeys(currentReport + "description");


    }


    private void save() {
        wd.findElement(By.xpath(PAGE_SAVE_BUTTON.get())).click();
    }

    private void next() {
        wd.findElement(By.xpath(PAGE_CONTINUE_BUTTON.get())).click();

    }

    private void run() {
        wd.findElement(By.xpath(PAGE_RUN_BUTTON.get())).click();


    }


}
