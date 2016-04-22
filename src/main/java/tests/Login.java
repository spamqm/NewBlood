package tests;

public class Login extends TestBase implements testAble {


    public Login(String profileURL, String browser, String mainURL) {
        super(profileURL, browser, mainURL);
    }


    public Login(String profileURL) {
        super(profileURL);
    }

    public void testLogin() {

        System.out.println(wd.getCurrentUrl());

        wd.get(wd.getCurrentUrl() + "pics.html");


    }


}
