package com.learn.design.behavioral.state;

public class DeliveredState implements OrderState {

    @Override
    public void nextState(OrderContext orderContext) {
        orderContext.setOrderState(this);
    }

    @Override
    public void cancelOrder(OrderContext orderContext) {
        System.out.println("Order is already delivered. Cannot cancel the order.");
    }

    @Override
    public String getStateName() {
        return "ORDER_DELIVERED";
    }
}
