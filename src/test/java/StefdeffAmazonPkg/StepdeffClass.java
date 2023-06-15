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
@Then("^Click All$")
public void click_All() throws Throwable {
    
}

@Then("^click Baby$")
public void click_Baby() throws Throwable {
    
}

@Then("^Enter baby shoes$")
public void enter_baby_shoes() throws Throwable {
   
}

@Then("^Click search button$")
public void click_search_button() throws Throwable {
   
}
@Then("^Verify User get all links from search feild$")
public void verify_User_get_all_links_from_search_feild() throws Throwable {
    
}




}
