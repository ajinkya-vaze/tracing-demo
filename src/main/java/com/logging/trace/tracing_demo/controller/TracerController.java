package com.logging.trace.tracing_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TracerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TracerController.class);

    @RequestMapping("/tracer")
    public String tracer() {
        LOGGER.info("Inside TracerController.tracer()");
        return "Tracer";
    }

    @RequestMapping("/tracer/error")
    public String exception() {
        LOGGER.info("Inside TracerController.exception()");
        throw new RuntimeException("Exception in TracerController.exception()");
    }

    @RequestMapping("tracer/{id}")
    public String tracerById(@PathVariable int id) {
        LOGGER.info("Inside TracerController.tracerById(): {}", id);
        return "Tracer by id: " + id;
    }
}
