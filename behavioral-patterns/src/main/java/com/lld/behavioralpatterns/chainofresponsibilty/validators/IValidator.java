package com.lld.behavioralpatterns.chainofresponsibilty.validators;

public interface IValidator {

    boolean validate();
    boolean validateNext();

}
