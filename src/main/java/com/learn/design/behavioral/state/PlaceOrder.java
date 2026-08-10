package com.learn.design.behavioral.state;

public class PlaceOrder implements OrderState {

    @Override
    public void nextState(OrderContext orderContext) {
        orderContext.setOrderState(new OrderPrepareState());
        System.out.println("Order is placed successfully. Moving to preparation stage.");
    }

    @Override
    public void cancelOrder(OrderContext orderContext) {
        orderContext.setOrderState(new OrderCancelState());
        System.out.println("Order is cancelled successfully.");
    }

    @Override
    public String getStateName() {
        return "ORDER_PLACED";
    }
}
