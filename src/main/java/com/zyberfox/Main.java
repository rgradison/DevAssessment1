package org.example;

import com.zyberfox.PrintAddress;
import com.zyberfox.model.Address;

public class Main {
    public static void main(String[] args) {
        PrintAddress printAddress = new PrintAddress();
        Address address = new Address();
        //Address address = printAddress.getAddress();
        printAddress.prettyPrintAddress(address);

    }
}
