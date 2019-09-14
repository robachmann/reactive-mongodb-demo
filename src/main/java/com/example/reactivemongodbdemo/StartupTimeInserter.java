package com.example.reactivemongodbdemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class StartupTimeInserter implements CommandLineRunner {

    private final ReactiveMongoTemplate mongoTemplate;

    @Override
    public void run(String... args) {

        Map<String, Instant> startupObject = new HashMap<>();
        startupObject.put("datetime", Instant.now());

        mongoTemplate.insert(startupObject, "startups")
                .subscribe(insertedObject -> log.info("added object={}", insertedObject));
    }
}
