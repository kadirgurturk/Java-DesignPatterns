package com.kadirgurturk.Command;

import com.kadirgurturk.Command.command.*;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        Command orderCommand = new OrderCommand(kitchen, "Masa 3: Pizza, İçecek");
        Command cancelOrderCommand = new CancelOrderCommand(kitchen, "Masa 3");

        Waiter waiter = new Waiter();

        waiter.setCommand(orderCommand);
        waiter.executeCommand(); // Masa 3 için sipariş verildi.

        waiter.setCommand(cancelOrderCommand);
        waiter.executeCommand(); // Masa 3 için sipariş iptal edildi.
    }
}
