package com.example.SecondSpringApp.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello/{name}")
    public String sayHelloPathVariable(@PathVariable String name) {
        logger.debug("DEBUG: Processing request with name={}", name);
        logger.info("INFO: GET /hello/{name} request received with name: {}", name);


        if (name.isEmpty()) {
            logger.warn("WARN: Path variable name is empty");
            return "Invalid request!";
        }

        if (name.equalsIgnoreCase("error")) {
            logger.error("ERROR: Invalid path variable name: {}", name);
            return "Invalid name!";
        }

        return "Hello " + name + " from BridgeLabz";
}
}