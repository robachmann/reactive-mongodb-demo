package com.example.reactivemongodbdemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class StartupTimeInserter implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;

    @Override
    public void run(String... args) {

        Map<String, Instant> startupObject = new HashMap<>();
        startupObject.put("datetime", Instant.now());

        Map<String, Instant> insertedObject = mongoTemplate.insert(startupObject, "startups");
        log.info("added object={}", insertedObject);
    }
}
