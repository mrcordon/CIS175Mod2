package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class TestRunner {

	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
		

	}

}
