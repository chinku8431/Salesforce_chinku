package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
public class TestValidLogin extends BaseTest{
	@Test
	public void testValidLogin() throws InterruptedException{
		LoginPage lp = new LoginPage(driver);
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		//Set username
		lp.setUsername(username);
		Thread.sleep(2000);
		//set password
		lp.setPassword(password);
		Thread.sleep(2000);
		//click on Login button
		lp.clickLogin();
		Assert.fail();
	}
}
