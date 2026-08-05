package com.learn.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouse {
    private final List<MenuItem> menuItems;

    public PancakeHouse() {
        menuItems = new ArrayList<>();
        addMenuItem("Avocado sandwich", "Sandwich with pesto and fresh herbs", true, 14.99);
        addMenuItem("Frittata rustica", "Italian style omelette", false, 13.99);
        addMenuItem("Pancake", "Strawberry and nutella", true, 15.99);
    }

    void addMenuItem(String name, String desc, boolean isVeg, double price) {
        MenuItem menuItem = new MenuItem(name, desc, isVeg, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getPancakeMenuItems() {
        return menuItems;
    }

    public Iterator createdPancakeHouseIterator(List<MenuItem> menuItems) {
        return new PancakeHouseIterator(menuItems);
    }
}
