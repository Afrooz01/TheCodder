package StefdeffAmazonPkg;

import UtilityAmazonPkg.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdeffClass extends BaseClass{
	@Given("^launch application <\"([^\"]*)\">$")
	public void launch_application(String URL) throws Throwable {
		lunchURL(URL);
	  

		
	}

	@When("^enter laptop on search feild$")
	public void enter_laptop_on_search_feild() throws Throwable {
	    
	}

	@When("^click search button$")
	public void click_search_button() throws Throwable {
	    
	}

	@Then("^user able to search any product$")
	public void user_able_to_search_any_product() throws Throwable {
	   
	}



}
