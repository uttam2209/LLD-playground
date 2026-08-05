package com.learn.design.behavioral.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MenuItem {
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;
}
