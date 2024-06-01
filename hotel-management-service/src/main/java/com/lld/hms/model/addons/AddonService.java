package com.lld.hms.model.addons;

import com.lld.hms.model.BaseRoom;

public abstract class AddonService extends BaseRoom {

    private BaseRoom room;

    public AddonService(BaseRoom room) {
        this.room = room;
    }
}
