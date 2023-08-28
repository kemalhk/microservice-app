package com.example.eurekaserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {

    private String name;
    private String date;
    private String imdbPoint;

}
