package com.zyberfox.model;

import java.util.HashMap;
import java.util.Map;

public class Type {

    private String code;
    private String name;
 
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
	@Override
	public String toString() {
		return "Type : code=" + code + ", name=" + name ;
	}

}
