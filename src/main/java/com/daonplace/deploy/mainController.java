package com.daonplace.deploy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @GetMapping("/")
    public ResponseEntity<Object> mainForm() {
        return ResponseEntity.ok("ok");
    }

}
