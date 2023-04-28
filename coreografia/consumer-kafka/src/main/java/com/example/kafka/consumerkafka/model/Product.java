package com.example.kafka.consumerkafka.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Product {

    private String id;
    private String name;
    private Integer stock;
    private BigDecimal price;

}
