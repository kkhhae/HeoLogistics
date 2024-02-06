package com.heologistics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String Main() {
        return "index.html";
    }

    @GetMapping("/normalDelivery")
    public String normalDelivery() {
        return "normalDelivery.html";
    }

    @GetMapping("/quickDelivery")
    public String quickDelivery() {
        return "quickDelivery.html";
    }

    @GetMapping("/hugeDelivery")
    public String hugeDelivery() {
        return "hugeDelivery.html";
    }

    @GetMapping("/customerService")
    public String customerService() {
        return "customerService.html";
    }

    @GetMapping("/customerServiceList")
    public String customerServiceList() {
        return "customerServiceList.html";
    }
    @GetMapping("/requestService")
    public String requestService() {
        return "requestService.html";
    }


}
