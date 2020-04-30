package com.company;

public class FancyRestaurant extends Restaurant implements Booking {

    private int totalWaiterCount;
    private Delivery delivery;
    private boolean onlineOrder;

    FancyRestaurant(String name, String address, String order, boolean onlineOrder){
        super(name, address, order);
        this.onlineOrder = onlineOrder;
//        this.totalWaiterCount = totalWaiterCount;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

     public void setTotalWaiterCount(int totalWaiterCount){
        this.totalWaiterCount = totalWaiterCount; //нужна ли эта часть?
    }


    public int getTotalWaiterCount() {
        return totalWaiterCount;
    }
    public void orderType() {
        if (onlineOrder == true) {
            System.out.println("Тип заказа: онлайн заказ");
        } else {
            System.out.println("Тип заказа: заказ в ресторане");
        }
    }
  /*
    void availableWaiter(){
        this.totalWaiterCount = totalWaiterCount;
        if (totalWaiterCount != 0) {
        try {
            System.out.println("Свободных официантов " + getTotalWaiterCount());
        } catch (Exception e) {

            System.out.println("Все официанты заняты");
        }
    }

   */


    @Override
    public void lookAtMenu() {
        if (onlineOrder == true) {
            System.out.println("Добавьте товар в корзину");
        } else {
            System.out.println("Ваше меню");
        }
    }

    @Override
    public void makeOrder() {
            System.out.println("Заказ принят");
    }

    @Override
    public void pay() {
        if (onlineOrder == true) {
            System.out.println("Курьер "+getDelivery()+" скоро будет");
        } else {
            System.out.println("Спасибо, приходите еще!");
        }
    }

    @Override //интерфейс
    public void bookTable() {
        System.out.println("Столик забронирован по телефону");
    }
}

