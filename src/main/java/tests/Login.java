package tests;

public class Login extends TestBase implements testAble {


    public Login() {
        super();
    }

    public Login(String mainURL) {
        super(mainURL);
    }

    public Login(String mainURL, String profile) {
        super(mainURL, profile);
    }

    public void testTestLogin() {
        log("Test LOGIN");
        testLogin();


    }


}
