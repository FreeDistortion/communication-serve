package com.example.communicationserve.restTemplate.controller;

import com.example.communicationserve.restTemplate.model.SampleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// service를 제공하는 controller
@RestController
@RequestMapping("/api/server")
public class RestServerController {
    @GetMapping("/first")
    public String firstRequest(){
        return "first communication";
    }
    @GetMapping("/getdata")
    public SampleResponse getData(){
        // DBMS에서 조회한 data response
        SampleResponse sampleResponseDTO = new SampleResponse(1L,"bts","1234","BTS")

        return "first communication";
    }
}
