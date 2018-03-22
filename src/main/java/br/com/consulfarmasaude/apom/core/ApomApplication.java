package br.com.consulfarmasaude.apom.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@EnableOAuth2Client
public class ApomApplication extends WebSecurityConfigurerAdapter  {

	public static void main(String[] args) {
		SpringApplication.run(ApomApplication.class, args);
	} 
}
 