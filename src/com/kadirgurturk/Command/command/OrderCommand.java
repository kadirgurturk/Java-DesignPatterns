package com.kadirgurturk.Command.command;

public class OrderCommand implements Command {
    private Kitchen kitchen;
    private String orderDetails;

    public OrderCommand(Kitchen kitchen, String orderDetails) {
        this.kitchen = kitchen;
        this.orderDetails = orderDetails;
    }

    @Override
    public void execute() {
        kitchen.prepareOrder(orderDetails);
    }
}