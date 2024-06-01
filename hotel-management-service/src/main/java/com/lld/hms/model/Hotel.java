package com.lld.hms.model;

import com.lld.common.model.LldBeanId;
import com.lld.common.model.address.Address;
import com.lld.hms.model.actors.HotelAdmin;

import java.util.List;

public class Hotel extends LldBeanId {

    private String name;
    private HotelAdmin admin;
    private List<HotelRoom>rooms;
    private Address address;
}
