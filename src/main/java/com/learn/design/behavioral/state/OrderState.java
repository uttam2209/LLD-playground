package com.learn.design.behavioral.state;

public interface OrderState {
    void nextState(OrderContext orderContext);
    void cancelOrder(OrderContext orderContext);
    String getStateName();
}
