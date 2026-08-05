package com.learn.design.behavioral.iterator;

public class DinerHouse {
    private final MenuItem[] menuItems = new MenuItem[5];
    private int noOfItems = 0;

    public DinerHouse() {
        addMenuItem("Biryani", "Veg biryani", true, 14.99);
        addMenuItem("Egg biryani", "Biryani with eggs", false, 13.99);
        addMenuItem("Hakka noodle", "Spicy hakka noodles", true, 15.99);
    }

    void addMenuItem(String name, String desc, boolean isVeg, double price) {
        MenuItem menuItem = new MenuItem(name, desc, isVeg, price);
        if (noOfItems >= 5) {
            throw new IllegalArgumentException("Cant add more than 5 menu items");
        }

        menuItems[noOfItems] = menuItem;
        noOfItems = noOfItems + 1;
    }

    public MenuItem[] getDinerHouseMenuItems() {
        return menuItems;
    }

    public Iterator createDinerIterator(MenuItem[] menuItems) {
        return new DinerHouseIterator(menuItems);
    }
}
