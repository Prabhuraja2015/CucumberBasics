package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
	    features = "src/test/resources/",   //feature file path
	    glue={"search","select","buy.computer","cnn"}, 			
	    plugin = {"html:target/cucumber-reports.html","rerun:rerun/failed_scenarios.txt"},                                
        tags ="@BuyCar",
        monochrome=true,
        dryRun=false
        )
public class MyRunner extends AbstractTestNGCucumberTests{

}


//tags ="@Buycomputer and @Buyinglaptop" -one scenario
//tags ="@Buycomputer"                    -one Featue
// tags ="@Buycomputer or @CarTrading"    - Two feature file will execute (Dont thik anyone will run)
// tags ="@BuyCar or @BuyingDesktops or @Buyinglaptop" - three scenarios will run

//not
//tags ="@BuyCar or @BuyingDesktops or not @Buyinglaptop" - @Buyinglaptop will not run

//To RERUN the failure test cases:
/*
 * @CucumberOptions( features = "@rerun/failed_scenarios.txt", //feature file
 * path glue={"search","select","buy.computer","cnn"}, plugin =
 * {"html:target/cucumber-reports.html","rerun:rerun/failed_scenarios.txt"},
 * tags ="@CNN or @CarTrading" ) public class MyRunner extends
 * AbstractTestNGCucumberTests{
 * 
 * }
 */
