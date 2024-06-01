package com.lld.hms.model.addons;

import com.lld.hms.enums.InRoomPurchaseType;
import com.lld.hms.model.BaseRoom;

public class InRoomPurchase extends AddonService {
    private InRoomPurchaseType type;
    private Double price;
    public InRoomPurchase(final BaseRoom room,final InRoomPurchaseType type, final Double price) {
        super(room);
        this.type=type;
        this.price=price;
    }

    @Override
    public double getCost() {
        System.out.println( "Cost for IRP : "+type +" : "+ price);
        return super.getCost() +price;
    }
}
