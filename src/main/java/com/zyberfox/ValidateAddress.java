package com.zyberfox;

import com.zyberfox.model.Address;

import java.util.Objects;
import java.util.regex.Pattern;

public class ValidateAddress {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    //Write a function to validate an address
    public boolean validateAddress(Address address) {
        boolean valid = false;
        if (address.getPostalCode() != null && isNumeric(address.getPostalCode()) && Objects.nonNull(address.getCountry()) &&
                validateCountryAdressLine(address)) {
            if (address.getCountry().getCode().equals("ZA")) {
                if (Objects.nonNull(address.getProvinceOrState()) && Objects.nonNull(address.getProvinceOrState().getName())) {
                    valid = true;
                } else {
                    valid = false;
                }
            }
        }
        return valid;
    }

    public boolean validateCountryAdressLine(Address address) {
        boolean valid = false;
        if (Objects.nonNull(address.getAddressLineDetail())) {
            if ((!address.getAddressLineDetail().getLine1().equals(null) && !address.getAddressLineDetail().getLine1().isEmpty()) ||
                    (!address.getAddressLineDetail().getLine2().equals(null) && !address.getAddressLineDetail().getLine2().isEmpty())) {
                valid = true;
            } else {
                valid = false;
            }
        }
        return valid;
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
