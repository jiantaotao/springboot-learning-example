package org.spring.springboot.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value= {"classpath:application-prod.yml"})
public class City {
	@Value(value="${city.name}")
	private String name;
	@Value(value="${city.id}")
	private String id;
	@Value(value="${city.country}")
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "City {name=" + name + ", id=" + id + ", country=" + country + "}";
	}
}
