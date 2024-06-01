package com.lld.behavioralpatterns.chainofresponsibilty.validators;

import java.io.File;
import java.util.logging.Logger;

public class FileFormatValidator extends BaseValidator {

    private final File file;

    public FileFormatValidator(File file) {
        this.file = file;
    }

    @Override
    public boolean validate() {
        if(file.exists() && file.isFile() && file.getName().endsWith(".csv")){
            return validateNext();
        }else{
            System.out.println("File is corrupt!");
            return false;
        }
    }
}
