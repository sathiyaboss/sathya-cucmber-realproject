package org.execution;

import org.supportpack.HelperPojo;
import org.supportpack.UtilClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends UtilClass{
	

@Given(": To user launch chrome browser and faceboook url")
public void toUserLaunchChromeBrowserAndFaceboookUrl() {
  browserLaunch("chrome");
  launchURL("https://www.facebook.com/");
}

@When(": TO user enter invalid username and invalid password")
public void toUserEnterInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
	String user = d.asLists().get(1).get(0);
	String pass = d.asLists().get(2).get(4);
	
	
	HelperPojo p = new HelperPojo();
	valuePass(p.getTxtemail(), user);
	valuePass(p.getTxtpass(), pass); 
}




@When(": To user click login button and verify invalid account message")
public void toUserClickLoginButtonAndVerifyInvalidAccountMessage() {
	HelperPojo p = new HelperPojo();
	btnClick(p.getLoginbtn()); 
}

@Then(": To user take a screen shot")
public void toUserTakeAScreenShot() {
	System.out.println("basic of cucumber frame work understand sucessfully");
    
}

/// 2nd scenario 
@When(": TO user click forget password button")
public void toUserClickForgetPasswordButton() {
	HelperPojo p = new HelperPojo();
	btnClick(p.getForgetpassbtn());
}

@When(": To user enter email address or phone number")
public void toUserEnterEmailAddressOrPhoneNumber() {
	HelperPojo p = new HelperPojo();
	valuePass(p.getTxtfindacc(), "8778736965");

}

@Then(": To user enter into valid or invalid credential page")
public void toUserEnterIntoValidOrInvalidCredentialPage() {
   System.out.println("Second senario sucess with backround ");
}





}
