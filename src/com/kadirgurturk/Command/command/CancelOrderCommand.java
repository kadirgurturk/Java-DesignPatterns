package com.kadirgurturk.Command.command;

public class CancelOrderCommand implements Command {
    private Kitchen kitchen;
    private String orderDetails;

    public CancelOrderCommand(Kitchen kitchen, String orderDetails) {
        this.kitchen = kitchen;
        this.orderDetails = orderDetails;
    }

    @Override
    public void execute() {
        kitchen.cancelOrder(orderDetails);
    }
}
