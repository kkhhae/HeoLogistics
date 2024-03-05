package com.heologistics.service;


import com.heologistics.entity.Receipt;
import com.heologistics.repository.DelivetyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private DelivetyRepository delivetyRepository;

}
