package com.example;

import io.micronaut.http.annotation.*;

@Controller("/googleCloudRunGradleGraalvmTest")
public class GoogleCloudRunGradleGraalvmTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}