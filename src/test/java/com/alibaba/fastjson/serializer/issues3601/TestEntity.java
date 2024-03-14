package com.alibaba.fastjson.serializer.issues3601;

import lombok.Data;

@Data
public class TestEntity {
    private TestEnum testEnum;
    private String testName;
    
	public TestEnum getTestEnum() {
		return testEnum;
	}
	public void setTestEnum(TestEnum testEnum) {
		this.testEnum = testEnum;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
}
