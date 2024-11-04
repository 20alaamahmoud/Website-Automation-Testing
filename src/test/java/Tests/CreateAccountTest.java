package Tests;

import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;

    @Test
    public void TestCreateAccount() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.Open_login_page();
        Thread.sleep(3000);
        loginPage=new LoginPage(driver);
        loginPage.Open_Create_Account_Page();
        Thread.sleep(3000);
        createAccountPage=new CreateAccountPage(driver);
        createAccountPage.add_data("NAME", "E-MAIL", "PHONE", "PASSWORD");
        Thread.sleep(3000);
        createAccountPage.submit_data();
        Thread.sleep(3000);
        //createAccountPage.add_code("2","2","2","2");
        //Thread.sleep(3000);
    }
}