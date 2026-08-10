package com.learn.design.behavioral.state;

public class OrderCancelState implements OrderState {
    @Override
    public void nextState(OrderContext orderContext) {
        orderContext.setOrderState(this);
    }

    @Override
    public void cancelOrder(OrderContext orderContext) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public String getStateName() {
        return "ORDER_CANCELLED";
    }
}
