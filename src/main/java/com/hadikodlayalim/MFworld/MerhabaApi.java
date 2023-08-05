package com.hadikodlayalim.MFworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesajkalite")
public class MerhabaApi {

    @GetMapping
    public String merhaba(){
        return "Merhaba Hoşgeldiniz";
    }
}
