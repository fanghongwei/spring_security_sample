package com.dbs.cap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test() {
        return "hello";
    }
    @GetMapping(value = "/hoo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hoo() {
        return "hello";
    }

}
