package com.lld.hms.model;

import com.lld.common.model.LldBeanId;

public abstract class BaseRoom extends LldBeanId {

    private double cost;

    public double getCost() {
        return this.cost;
    }
}
