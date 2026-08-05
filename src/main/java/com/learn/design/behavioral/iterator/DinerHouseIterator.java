package com.learn.design.behavioral.iterator;

public class DinerHouseIterator implements Iterator {
    private final MenuItem[] menuItems;
    int position = 0;

    public DinerHouseIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.length > position && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }
}
