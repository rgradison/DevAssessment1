package com.zyberfox;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zyberfox.model.Address;

public class PrintAddress {

    //Write a function to pretty print all the addresses in the attached file
    public String prettyPrintAddress(Address address) {

        ObjectMapper mapper = new ObjectMapper();
        String json = "";

        try {
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return json;
    }

    //Write a function to print an address of a certain type (postal, physical, business)
    public void prettyPrintAddressType(Address address) {

        ObjectMapper mapper = new ObjectMapper();
        String json = "";

        try {
            if (address.getType().getName().equals("Physical Address")) {
                json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
                System.out.println(json);
            }
            if (address.getType().getName().equals("Postal Address")) {
                json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
                System.out.println(json);
            }
            if (address.getType().getName().equals("Business Address")) {
                json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
                System.out.println(json);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void prettyPrintAddressFormat(Address address) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";

        try {
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }

}
