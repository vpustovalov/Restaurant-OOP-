package com.company;

public class StreetFood extends Restaurant {
    StreetFood(String name, String address, String order) {
        super(name, address, order);
    }

 /*   private int totalWaiterCount;

    public void setTotalWaiterCount (int totalWaiterCount){
        this.totalWaiterCount = totalWaiterCount;
    }
    public int getTotalWaiterCount() {
        return totalWaiterCount;
    }
*/


    @Override //переопределение метода
    public void lookAtMenu() {
        System.out.println("Что хотите заказать?");
    }

    @Override //переопределение метода
    public void makeOrder() {
        System.out.println("Заказ принят!");
    }

    @Override //переопределение метода
    public void pay() {
        System.out.println("Заказ оплачен!");
    }

}
