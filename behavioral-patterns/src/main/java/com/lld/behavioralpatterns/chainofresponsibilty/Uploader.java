package com.lld.behavioralpatterns.chainofresponsibilty;


import com.lld.behavioralpatterns.chainofresponsibilty.validators.BaseValidator;
import com.lld.behavioralpatterns.chainofresponsibilty.validators.FileFormatValidator;
import com.lld.behavioralpatterns.chainofresponsibilty.validators.SchemaValidator;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Uploader {

    public static void main(String[] args) throws IOException {
       File file = new File("behavioral-patterns/src/main/java/com/lld/behavioralpatterns/chainofresponsibilty/industry_sic.csv");
        List<String> headers = List.of("SIC Code","Description");
        BaseValidator fileFormatValidator = new FileFormatValidator(file);
        BaseValidator schemaValidator = new SchemaValidator(file, headers);

        fileFormatValidator.setNextIValidator(schemaValidator);

        if(fileFormatValidator.validate()){
            System.out.println("Validation Successful!");
        }else{
            System.out.println("Validation Failed!");
        }

    }

}
