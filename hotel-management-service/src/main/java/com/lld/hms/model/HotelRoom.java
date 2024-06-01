package com.lld.hms.model;

import com.lld.common.model.LldBeanId;
import com.lld.hms.enums.RoomType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HotelRoom extends BaseRoom {
    private String number;
    private Integer floor;
    private RoomType roomType;
    private boolean occupancy;
    private boolean isBooked;
    private List<HouseKeepingLog>houseKeepingLogs;


}
