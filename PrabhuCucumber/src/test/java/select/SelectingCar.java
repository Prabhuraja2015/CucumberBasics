package select;

import io.cucumber.java.en.And;
import mycar.CarType;

public class SelectingCar {
	
	CarType ct3;
	public SelectingCar (CarType ct5)
	
	{
		this.ct3=ct5;
	}
	

@And("Car should be from Hyundai")
public void car_should_be_from_Hyundai() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hyundai");
	System.out.println("car_should_be_from_Hyundai_Result "+ct3.name);
   }



}
