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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

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
        try {
            String carType = URLEncoder.encode(receiptData.getCarType(), StandardCharsets.UTF_8.toString());
            String price = URLEncoder.encode(receiptData.getPrice(), StandardCharsets.UTF_8.toString());
            String distance = URLEncoder.encode(receiptData.getDistance(), StandardCharsets.UTF_8.toString());
            String deliveryAddress = URLEncoder.encode(receiptData.getDeliveryAddress(), StandardCharsets.UTF_8.toString());
            String deliveryDate = URLEncoder.encode(receiptData.getDeliveryDate(), StandardCharsets.UTF_8.toString());
            String toll = URLEncoder.encode(receiptData.getToll(), StandardCharsets.UTF_8.toString());
            String duration = URLEncoder.encode(receiptData.getDuration(), StandardCharsets.UTF_8.toString());

            return "redirect:/requestComplete.html?carType=" + carType + "&price=" + price + "&distance=" + distance + "&deliveryAddress=" + deliveryAddress + "&deliveryDate=" + deliveryDate + "&toll=" + toll + "&duration=" + duration;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
