package com.vetyugov.spring.tacos.web;

import lombok.Data;
import org.apache.tomcat.util.buf.StringCache;

@Data
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
