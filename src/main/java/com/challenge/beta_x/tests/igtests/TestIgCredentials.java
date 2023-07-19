package com.challenge.beta_x.tests.igtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.challenge.beta_x.pages.ig.StartSessionPage;
import com.challenge.beta_x.tests.BaseTest001;

public class TestIgCredentials extends BaseTest001 {

	@DataProvider(name = "credentials", parallel = true)
	public Object[][] dpcredentials() {
		return new Object[][] { new Object[] { "sandyPapo", "doic8dbIDCNDUNCSXNn", "sabastianrbt0002@gmail.com" } };
	}

	@Test(dataProvider = "credentials")
	public void rescuePassword(String username, String passwd, String emailRescue) throws InterruptedException {

		StartSessionPage sessionPage = new StartSessionPage(driver);
		sessionPage.startSessionHomePage(username, passwd);
		sessionPage.recoveryAccount();
		sessionPage.setEmailRescue(emailRescue);
		sessionPage.clickRescueButton();

	}

}
