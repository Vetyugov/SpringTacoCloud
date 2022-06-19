package com.vetyugov.spring.tacos;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List ingredients;
}
