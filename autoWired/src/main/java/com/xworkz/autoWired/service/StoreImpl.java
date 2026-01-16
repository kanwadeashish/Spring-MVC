package com.xworkz.autoWired.service;

import org.springframework.stereotype.Service;

@Service
public class StoreImpl implements Store{

    @Override
    public void storeDetails() {
        System.out.println("StoreImpl Method.....");
    }
}
