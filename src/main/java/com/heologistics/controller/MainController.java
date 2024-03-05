package com.heologistics.controller;


import com.heologistics.entity.Receipt;
import com.heologistics.repository.DelivetyRepository;
import com.heologistics.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private DelivetyRepository delivetyRepository;


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

    @GetMapping("/requestResult")
    public String requestResult(){
        return "requestResult.html";
    }

    @GetMapping("/requestComplete")
    public String requestComplete(){
        return "requestComplete.html";
    }

    @PostMapping(value = "/requestComplete", consumes = "application/json")
    public String requestAction(@RequestBody Receipt receiptData, Model model) {
        delivetyRepository.save(receiptData);
        model.addAttribute("receipt", receiptData);
        return "requestComplete.html";
    }
}
