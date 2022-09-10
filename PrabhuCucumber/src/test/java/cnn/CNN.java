package cnn;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import datacheck.Toplinks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CNN {
	
	@Given("I open browser")
	public void i_open_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I open browser CNN");
	    
	}
	
	@Given("I want to open {string}")
	public void i_want_to_open(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I open "+browser);
	}
	
	@And("I go to site {string}")
	public void i_go_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I open browser CNN "+string);
	}
	
	@And("I navigate to site {string}")
	public void i_navigate_to_site(String site) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I navigate to site "+site);
	}
	
	/*
	 * @Then("Menu should have links") public void menu_should_have_links(DataTable
	 * table) { // Write code here that turns the phrase above into concrete actions
	 * System.out.println("Menu should have links "+table.toString());
	 * System.out.println("Menu should have links new "+table.asMaps());
	 * List<Map<String,String>> data=table.asMaps();
	 * System.out.println("---new lines---"); System.out.println(data.get(0));
	 * System.out.println(data.get(1)); System.out.println("&&& new lines&&&");
	 * System.out.println(data.get(0).get("Links"));
	 * System.out.println(data.get(0).get("Title"));
	 * System.out.println(data.get(1).get("Links"));
	 * System.out.println(data.get(1).get("Title")); }
	 */
	
	@Then("Menu should have links")
	public void menu_should_have_links(List<Toplinks> topLinks) {
		Assert.assertEquals("A", "A");
		//Assert.fail("Fail the test case"); //It will directly fail the test case
		System.out.println("Menu should have links "+topLinks.toString());
		System.out.println(topLinks.get(0).linkname + "----"+topLinks.get(0).titlename);
		System.out.println(topLinks.get(1).linkname + "----"+topLinks.get(1).titlename);
		
		
	
	}
	
	 @DataTableType
	    public Toplinks entry(Map<String, String> entry) {
		    System.out.println("X");
	        return new Toplinks( entry.get("Links"), entry.get("Title"));
	    }
 
		/*
		 * @DataTableType public Toplinks entr(Map<String, String> entry) {
		 * 
		 * Toplinks t1=new Toplinks(entry.get("Links"), entry.get("Title"));
		 * 
		 * return t1; }
		 */
}
