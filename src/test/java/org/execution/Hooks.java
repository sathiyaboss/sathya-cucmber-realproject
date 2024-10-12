package org.execution;

import org.supportpack.UtilClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends UtilClass {
	
	
	@Before
	public void beforeExOfScenario() {
		timeAndDate();
		System.out.println("@before");

	}
	
	@After
	public void afterExOfScenario() {
		timeAndDate();
		System.out.println("@after");

	}

}
