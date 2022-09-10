package buy.computer;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Computer {
	
	
	@Given("^I want to buy a PC$")
	public void buy_pc() {
		System.out.println("Buy a PC");
	}
	
	@And("^PC should be from (.*)$")
	public void pc_model(String company) {
		System.out.println(company);
	}
	
	@When("^select the (.*) size as (\\d+) inch$")  //DONT ADD CUCUMBER exp with Regular EXP
	public void select_the_monitor_size_as_inch(String screentype, int size) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(screentype +" is "+size);
	}
	
	@When("a {string} finish")
	public void a_finish(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Finish is "+string);
	}
}
