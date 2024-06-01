package com.lld.common.util;

public interface LldBeanFactory<T> {

    default T getSingeltonBean(){
        return null;
    };
}
