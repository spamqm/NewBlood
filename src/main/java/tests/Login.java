package tests;

public class Login extends TestBase {

    public Login(String browser, String URL) {
        super(browser, URL);
    }


    public void testLogin() {

        System.out.println(wd.getCurrentUrl());

        wd.get(wd.getCurrentUrl() + "pics.html");


    }


}
