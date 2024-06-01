package com.lld.behavioralpatterns.chainofresponsibilty.validators;

public abstract class BaseValidator implements IValidator {
    IValidator nextIValidator;

    @Override
    public boolean validateNext() {
        if(nextIValidator ==null) return true;
        else return nextIValidator.validate();
    }

    public void setNextIValidator(IValidator nextIValidator) {
        this.nextIValidator = nextIValidator;
    }
}
