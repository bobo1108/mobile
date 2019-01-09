package net.beifeng.mobile_scm.test.action;

import java.sql.SQLException;

import net.beifeng.mobile_scm.test.service.TestService;

public class TestAction {
	private String name;
	
	private TestService testService;
	
	public TestService getTestService() {
		return testService;
	}
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute() throws SQLException {
		System.out.println(name);
		name=testService.validateName(name);
		return "ret";
	}
}
