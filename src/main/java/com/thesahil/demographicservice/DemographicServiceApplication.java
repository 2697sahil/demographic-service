package com.thesahil.demographicservice;

import com.thesahil.demographicservice.entity.CityStateCountry;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

@SpringBootApplication
public class DemographicServiceApplication {

	@Autowired
	private DynamoDbEnhancedClient dynamoDbEnhancedClient;

//	@PostConstruct
//	public void createTable(){
//		dynamoDbEnhancedClient.table("city_state_country", TableSchema.fromBean(CityStateCountry.class)).createTable();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemographicServiceApplication.class, args);
	}

}
