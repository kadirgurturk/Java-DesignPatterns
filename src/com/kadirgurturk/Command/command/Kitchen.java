package com.kadirgurturk.Command.command;

public class Kitchen {
    public void prepareOrder(String orderDetails) {
        // Sipariş hazırlama işlemleri
        System.out.println("Sipariş hazırlanıyor: " + orderDetails);
        // ... sipariş hazırlama işlemleri gerçekleştirilir ...
        System.out.println("Sipariş hazır: " + orderDetails);
    }

    public void cancelOrder(String orderDetails) {
        // Sipariş iptali işlemleri
        System.out.println("Sipariş iptal ediliyor: " + orderDetails);
        // ... sipariş iptali işlemleri gerçekleştirilir ...
        System.out.println("Sipariş iptal edildi: " + orderDetails);
    }
}