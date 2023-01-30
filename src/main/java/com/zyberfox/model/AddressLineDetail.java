
package com.zyberfox.model;

import java.util.HashMap;
import java.util.Map;

public class AddressLineDetail {

    private String line1;
    private String line2;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
