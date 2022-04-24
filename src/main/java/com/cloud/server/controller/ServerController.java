package com.cloud.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ServerController {

    @Autowired
    StreamBridge streamBridge;

    @GetMapping("/server")
    public ResponseEntity<?> execute() {
        if(streamBridge.send("event-buzz", "Buzz")) {
            return ResponseEntity.ok("OK");
        }
        return ResponseEntity.unprocessableEntity().build();
    }
}
