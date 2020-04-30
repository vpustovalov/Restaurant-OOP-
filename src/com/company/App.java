package com.company;

public class App {

    public static void main( String[] args ) {

        StreetFood order1 = new StreetFood("Шаурма-Донер","Гагарина 4","Куриная шаурма");
        System.out.println(order1.getName() + ", " + order1.getAddress() + ", " + order1.getOrder());
        order1.lookAtMenu();
        order1.makeOrder();
        order1.pay();
        System.out.println(" ");

        FancyRestaurant order2 = new FancyRestaurant("Репортеръ","Яворницкого 45","Паста",true);

        System.out.println(order2.getName() + ", " + order2.getAddress() + ", " + order2.getOrder());
        order2.orderType();
        order2.setDelivery(Delivery.GLOVO);
        order2.makeOrder();
        order2.pay();
        System.out.println(" ");

        FancyRestaurant order3 = new FancyRestaurant("Конфетти","Гагарина 12","Стейк",false);
        System.out.println(order3.getName() + ", " + order3.getAddress() + ", " + order3.getOrder());
        //order3.setTotalWaiterCount();
        order3.bookTable();
        order3.orderType();
        order3.lookAtMenu();
        order3.makeOrder();
        order3.pay();
        System.out.println(" ");
        System.out.println("Кол-во заказов: " + Restaurant.countInstances());
    }
}
