package com.logging.trace.tracing_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomErrorController implements ErrorController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomErrorController.class);

    @RequestMapping(value = "${error.path:/error}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, Object> handleError() {
        Map<String, Object> attributes = Map.of("status", 500);
        LOGGER.error("Inside CustomErrorController.handleError()");
        return attributes;
    }
}
