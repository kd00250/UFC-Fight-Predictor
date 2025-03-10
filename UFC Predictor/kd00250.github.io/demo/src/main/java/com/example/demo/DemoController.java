package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.westga.cs1302.javafx_sample.Main;

@RestController
public class DemoController {

    @GetMapping("/api/run-main")
    public String runMain() {
        try {
            Main.main(new String[]{});
            return "Main.start() executed successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error executing Main.start(): " + e.getMessage();
        }
    }
}
