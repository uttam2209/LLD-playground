package com.learn.design.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        PancakeHouse pancakeHouse = new PancakeHouse();
        var pancakeHouseItems = pancakeHouse.createPancakeHouseIterator(pancakeHouse.getPancakeMenuItems());
        System.out.println("Pancake House Menu:");
        while (pancakeHouseItems.hasNext()) {
            System.out.println(pancakeHouseItems.next().toString());
        }

        DinerHouse dinerHouse = new DinerHouse();
        var dinerHouseItems = dinerHouse.createDinerIterator(dinerHouse.getDinerHouseMenuItems());
        System.out.println("\nDiner House Menu:");
        while (dinerHouseItems.hasNext()) {
            System.out.println(dinerHouseItems.next().toString());
        }
    }
}
