package com.prodapt.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prodapt.app.utils.LoadAllProperties;

@SpringBootApplication
@EnableConfigurationProperties(LoadAllProperties.class)
@EnableJpaRepositories(basePackages = "com.prodapt.app.repository")
public class PdnUsersApplication {
	
	private static final Logger log = LogManager.getLogger(PdnUsersApplication.class.getName());
	
	public static void main(String[] args) {
		log.info("######## Starting Service ########");
		SpringApplication.run(PdnUsersApplication.class, args);
		log.info("######## Successfully started Service ########");
	}

}
