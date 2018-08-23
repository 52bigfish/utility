package com.hd.utility.vmda.steps;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(
//	features = {"src/test/resources/features"},
//	tags = {"@base_flow2"},
//	monochrome = true,
//	plugin = {"pretty"},
//	snippets = SnippetType.CAMELCASE
//)
public class BaseFlowSteps2{

//public BaseSteps() {
//		Given("test init equals false{int}", (Integer int1) -> {
//		});
//		When("test run equals false{int}", (Integer int1) -> {
//		});
//	}
	
//	@Given("test init equals value {int}")
//	public void testInitEqualsValue(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

//	@When("test run equals value {string}")
//	public void testRunEqualsValue(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

	
	
//	@Given("test init equals value (\\d+)")
//	public void testInitEqualsValue(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//	
//	@When("test run equals value (.*?)")
//	public void testRunEqualsValue(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
	
//	@Given("test init equals value {int}")
//	public void test_init_equals_value(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("test run equals value {string}")
//	public void test_run_equals_value(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

//	@Given("the number of banana is {int}")
//	public void the_number_of_banana_is(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("this is {string}")
//	public void this_is(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
	
	@Given("the {int}")
	public void the(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("the {string}")
	public void the(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
