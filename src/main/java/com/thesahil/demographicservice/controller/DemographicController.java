package com.thesahil.demographicservice.controller;

import com.thesahil.demographicservice.entity.CityStateCountry;
import io.awspring.cloud.dynamodb.DynamoDbTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import software.amazon.awssdk.enhanced.dynamodb.Key;
@Slf4j
@RestController
@RequestMapping("/cityStateCountry")
public class DemographicController {

    @Autowired
    private DynamoDbTemplate cityStateCountryDynamoDbTemplate;

    @GetMapping
    public ResponseEntity<CityStateCountry> getCityStateCountry(@RequestParam String cityCode) {
        CityStateCountry foundRecord =
                cityStateCountryDynamoDbTemplate.load(Key.builder().partitionValue(cityCode).build(),
                CityStateCountry.class);
        log.info("Found record: [{}]", foundRecord);
        return ResponseEntity.ok(foundRecord);
    }

    @PostMapping
    public ResponseEntity<CityStateCountry> saveCityStateCountry(@RequestBody CityStateCountry cityStateCountry) {
        log.info("Request received: [{}]", cityStateCountry);
        CityStateCountry savedRecord = cityStateCountryDynamoDbTemplate.save(cityStateCountry);
        return ResponseEntity.ok(savedRecord);
    }
}
