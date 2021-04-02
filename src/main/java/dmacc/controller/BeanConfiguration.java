package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Producer;
import dmacc.beans.Movie;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Movie movie() {
		Movie bean = new Movie("Emperor's New Groove");
		return bean;
	}

	@Bean
	public Producer producer() {
		Producer bean = new Producer("John", "Smith", "52 Years Old");
		return bean;
	}
	
}
