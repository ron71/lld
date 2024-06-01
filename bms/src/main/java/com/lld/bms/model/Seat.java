package com.lld.bms.model;

import com.lld.bms.enums.BookingStatus;
import com.lld.bms.enums.SeatType;
import com.lld.common.model.LldBeanId;

public class Seat extends LldBeanId {

    private BookingStatus status;
    private SeatType type;
    private Double price;

}
