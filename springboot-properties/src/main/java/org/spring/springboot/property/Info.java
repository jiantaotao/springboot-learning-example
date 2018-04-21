package org.spring.springboot.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Info {
	@Value("${info.name}")
	private String name;
	@Value("${info.location}")
	private String location;
	@Value("${info.age}")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Info {name=" + name + ", location=" + location + ", age=" + age + "}";
	}
	
}
