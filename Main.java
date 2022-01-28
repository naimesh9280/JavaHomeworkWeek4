package com.javahomeworkweek4;

public class Main {
    public static void main(String[] args) {
        DetachedHouse detachedHouse = new DetachedHouse();
        DetachedHouse.Parking();
        DetachedHouse.Extra();

        SemiDetachedHouse semiDetachedHouse = new SemiDetachedHouse();
        SemiDetachedHouse.Floor();

        TerracedHouse terracedHouse = new TerracedHouse();
        TerracedHouse.Garden();
        TerracedHouse.NotAvailable();


    }
}
