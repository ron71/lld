package com.lld.bms.model;

import com.lld.common.model.LldBeanId;
import com.lld.common.model.address.Address;

import java.util.List;

public class CinemaTheater extends LldBeanId {
    private String name;
    private Address address;
    private List<Audi> audis;
}
