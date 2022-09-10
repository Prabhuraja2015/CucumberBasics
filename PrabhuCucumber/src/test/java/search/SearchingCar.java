package search;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mycar.CarType;
import select.Address;


public class SearchingCar {
	
	 CarType ct2;
	
	 public SearchingCar(CarType ct5)
	 { 
		 this.ct2=ct5; 
	 }
	 
	
	@Before
	public void init(Scenario s) {
		System.out.println("------------INIT---------------"+s.getName());
		
	}
	
	@After
	public void end(Scenario s)
	{
		System.out.println("------------END---------------"+s.getName());
	}
	
	
	@ParameterType("(.+?)")
	public String colors(String allColors)
	{
		System.out.println(allColors);
		return allColors.split(",")[1];
		//return allColors;
		
	}
	
	@ParameterType("(.+?)")
	public Address address(String address)
	{	
		Address a1=new Address();
		a1.housenbr=address.split(",")[0];
		a1.street=address.split(",")[1];
		a1.city=address.split(",")[2];		
		return a1;
		
	}
	
	
	@Given("I want to buy {int} car")
	public void I_want_to_buy(int x) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("car number "+x);
		ct2.name="Merz";
	    
	}	
	
	@And("Car shape is {string}")
	public void car_shape_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Shape is "+string);
		System.out.println("car_shape_is "+ct2.name);
	}
	
	@And("car can be {colors} in color")
	public void car_color_is(String color) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("car color can be in "+color);
	}
	
	@And("car showroom address is {address}")
	public void car_showroom_address_is(Address a1 ) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("address is "+a1.housenbr);
		 System.out.println("address is "+a1.street);
		 System.out.println("address is "+a1.city);
		 a1.printNames();
	}
	

}
