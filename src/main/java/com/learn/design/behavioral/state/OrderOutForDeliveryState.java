package com.learn.design.behavioral.state;

public class OrderOutForDeliveryState implements OrderState{

    @Override
    public void nextState(OrderContext orderContext) {
        orderContext.setOrderState(new DeliveredState());
    }

    @Override
    public void cancelOrder(OrderContext orderContext) {
        System.out.println("Order is out for delivery and cannot be canceled.");
    }

    @Override
    public String getStateName() {
        return "ORDER_OUT_FOR_DELIVERY";
    }
}
