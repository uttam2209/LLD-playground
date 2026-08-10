package com.learn.design.behavioral.state;

public class OrderPrepareState implements OrderState {

    @Override
    public void nextState(OrderContext orderContext) {
        orderContext.setOrderState(new OrderOutForDeliveryState());
        System.out.println("Order is now out for delivery.");
    }

    @Override
    public void cancelOrder(OrderContext orderContext) {
        System.out.println("Order cannot be cancelled at this stage.");
    }

    @Override
    public String getStateName() {
        return "ORDER_PREPARE";
    }
}
