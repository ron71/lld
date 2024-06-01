package com.lld.hms.model.actors;

import com.lld.common.model.Contact;
import com.lld.common.model.address.Address;
import com.lld.common.model.user.LldUser;
import com.lld.hms.model.RoomBooking;

import java.util.List;

public class Guest extends LldUser {

    private Address address;
    private Contact contact;
    private List<RoomBooking>roomBookings;

    public RoomBooking cancelBooking(final RoomBooking roomBooking){
        return null;
    }

    public RoomBooking addBooking(final RoomBooking roomBooking){
        return null;
    }
}
