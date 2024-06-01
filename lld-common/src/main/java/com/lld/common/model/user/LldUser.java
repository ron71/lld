package com.lld.common.model.user;

import com.lld.common.model.LldBeanId;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class LldUser extends LldBeanId {
    private String name;
    private boolean isBlocked;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateTime;
}
