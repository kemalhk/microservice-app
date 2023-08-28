package com.example.movieclient.controller;

import com.example.movieclient.domain.Movie;
import com.netflix.discovery.DiscoveryClient;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class Controller {
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String handleRequest(Model model){


        return "movie";
    }
}
