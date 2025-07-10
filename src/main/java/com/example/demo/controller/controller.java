package com.example.demo.controller;

import com.example.demo.crawler.KeelungSightsCrawler;
import com.example.demo.model.Sight;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
public class controller {

    // Test ping
    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello world");
    }

    @GetMapping("/crawlerTest")
    public Sight[] crawlerTest() throws IOException {
        KeelungSightsCrawler crawler = new KeelungSightsCrawler();
        return crawler.getItems("七堵");
    }

    @GetMapping("/SightAPI")
    public ResponseEntity<Sight[]> sightStatus(
            @RequestParam(value = "zone", required = true) String zone
    ) throws IOException {
        KeelungSightsCrawler crawler = new KeelungSightsCrawler();
        Sight[] sights = crawler.getItems(zone);
        return sights == null
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(sights);
    }



}
