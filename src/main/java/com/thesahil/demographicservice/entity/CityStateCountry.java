package com.thesahil.demographicservice.entity;

import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@DynamoDbBean
public class CityStateCountry {

    private String cityCode;
    private String cityName;
    private String stateCode;
    private String stateName;
    private String countryCode;
    private String countryName;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("city_code")
    public String getCityCode() {
        return cityCode;
    }

    @DynamoDbAttribute("city_name")
    public String getCityName() {
        return cityName;
    }

    @DynamoDbAttribute("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @DynamoDbAttribute("state_name")
    public String getStateName() {
        return stateName;
    }

    @DynamoDbAttribute("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @DynamoDbAttribute("country_name")
    public String getCountryName() {
        return countryName;
    }
}
