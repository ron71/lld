package com.lld.hms.model.addons;

import com.lld.hms.enums.InRoomPurchaseType;
import com.lld.hms.enums.RoomServiceType;
import com.lld.hms.model.BaseRoom;

public class RoomService extends AddonService {

    private RoomServiceType type;
    private Double price;
    public RoomService(final BaseRoom room,final RoomServiceType type, final Double price) {
        super(room);
        this.type=type;
        this.price=price;
    }

    @Override
    public double getCost() {
        System.out.println( "Cost for RS : "+type +" : "+ price);
        return super.getCost() +price;
    }
}
