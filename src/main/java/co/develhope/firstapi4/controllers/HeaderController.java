package co.develhope.firstapi4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HeaderController{

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader HttpHeaders headers){
        return headers.getHost().getHostName() + " " + headers.getHost().getPort();
    }
}