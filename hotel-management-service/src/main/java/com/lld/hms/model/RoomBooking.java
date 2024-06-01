package com.lld.hms.model;

import com.lld.common.model.LldBeanId;
import com.lld.hms.enums.InRoomPurchaseType;
import com.lld.hms.enums.RoomServiceType;
import com.lld.hms.model.actors.Guest;
import com.lld.hms.model.actors.Receptionist;
import com.lld.hms.model.addons.AddonService;
import com.lld.hms.model.addons.InRoomPurchase;
import com.lld.hms.model.addons.RoomService;

import java.time.LocalDateTime;
import java.util.List;

public class RoomBooking extends LldBeanId {
    private HotelRoom room;
    private List<Guest> guests;
    private Receptionist receptionist;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private LocalDateTime bookingTime;
    private double advancePay;
    private AddonService addonService;

    public void addInRoomPurchase(final InRoomPurchaseType type, final double price) {

        if (null != addonService) {
            this.addonService = new InRoomPurchase(this.addonService, type, price);
        }
    }

    public void addRoomService(final RoomServiceType type, final double price) {
        if (null != addonService) {
            this.addonService = new RoomService(this.addonService, type, price);
        }
    }

    public Double calculateTotalCost() {
        return this.addonService.getCost() + this.room.getCost() - this.advancePay;
    }
}
