package com.learn.design.behavioral.state;

public class OrderContext {
    private OrderState orderState;

    public OrderContext() {
        this.orderState = new PlaceOrder();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void nextState() {
        orderState.nextState(this);
    }

    public void cancelOrder() {
        orderState.cancelOrder(this);
    }

    public String getStateName() {
        return orderState.getStateName();
    }
}
