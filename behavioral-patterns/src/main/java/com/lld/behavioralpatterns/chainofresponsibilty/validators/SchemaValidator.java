package com.lld.behavioralpatterns.chainofresponsibilty.validators;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchemaValidator extends BaseValidator{

    private final File file;
    private final List<String> headers;

    public SchemaValidator(File file, List<String> headers) {
        this.file = file;
        this.headers = headers;
    }


    @Override
    public boolean validate() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner sc = new Scanner(fileInputStream);
            String[] headersFromFile = sc.nextLine().split(",");
            fileInputStream.close();
            if(Arrays.stream(headersFromFile).allMatch(headers::contains)){
                return validateNext();
            }else{
                System.out.println("Column didn't match!");
                return false;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
