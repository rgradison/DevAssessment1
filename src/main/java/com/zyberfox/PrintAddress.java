package com.zyberfox;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zyberfox.model.Address;
import org.json.simple.JSONObject;

import java.util.regex.Pattern;

public class PrintAddress {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    ObjectMapper mapper;

    String json = "";

    //Write a function to pretty print all the addresses in the attached file
    public String prettyPrintAddress(Address address) {

        mapper = new ObjectMapper();

        try {
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return json;
    }

    //Write a function to print an address of a certain type (postal, physical, business)
    public void prettyPrintAddressType(Address address, JSONObject jSONObject) {

        mapper = new ObjectMapper();

        try {
            if (jSONObject.containsKey("type")) {
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void prettyPrintAddressFormat(Address address, JSONObject jSONObject) {
        mapper = new ObjectMapper();

        try {
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }

}
