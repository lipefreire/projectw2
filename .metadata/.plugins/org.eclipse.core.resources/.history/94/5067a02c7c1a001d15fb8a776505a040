package com.consultorioapp.projetopw2;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class dbConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/consultorio");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		
	}
}
