package com.hd.utility.vmda.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(
//	features = {"src/test/resources/features"},
//	tags = {"@base_flow1"},
//	monochrome = true,
//	plugin = {"pretty"},
//	snippets = SnippetType.CAMELCASE
//)
public class BaseFlowSteps1 {
	
//	public BaseFlowSteps1() {
//		Given("{string},{string},{string},{string}",(String type, String url, String timezone, String redanduncyUrl) -> {
//					initElements(type, url, timezone, redanduncyUrl);
//				});
//		When("test init equals false", () -> {
//			Assert.assertFalse(false);
//		});
//		Then("test prepare data equals false", () -> {
//			Assert.assertFalse(false);
//		});
//	}
	
//	private void initElements(String type, String url, String timezone, String redanduncyUrl) {
//	}
	
	
//	@Given("set params {string},{string},{string},{string}")
//	public void setParams(String string, String string2, String string3, String string4) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("seta paramsa {string},{string},{string},{string}")
//	public void setaParamsa(String string, String string2, String string3, String string4) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
	
	@Given("seta paramsa")
	public void setaParamsa() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@When("test init equals false")
	public void testInitEqualsFalse() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("test prepare data equals false")
	public void testPrepareDataEqualsFalse() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
}
