package com.zyberfox;

import com.zyberfox.model.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Objects;

public class Main {
	public static void main(String[] args) throws Exception {
		PrintAddress printAddress = new PrintAddress();

		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("static/addresses.json"));

		for (Object obj : a) {
			createJavaObject(printAddress, obj);
		}

	}

	private static void createJavaObject(PrintAddress printAddress, Object obj) {
		Address address = new Address();
		JSONObject addressObj = (JSONObject) obj;

		//address.setId((String) addressObj.get("id"));

		JSONObject typeObj = (JSONObject) addressObj.get("type");
		Type type = new Type();
		type.setCode((String) typeObj.get("code"));
		type.setName((String) typeObj.get("name"));

		if (Objects.nonNull((JSONObject) addressObj.get("addressLineDetail"))) {
			JSONObject addressLineDetailObj = (JSONObject) addressObj.get("addressLineDetail");
			AddressLineDetail addressLineDetail = new AddressLineDetail();
			addressLineDetail.setLine1((String) addressLineDetailObj.get("line1"));
			addressLineDetail.setLine2((String) addressLineDetailObj.get("line2"));
			address.setAddressLineDetail(addressLineDetail);
		}

		JSONObject provinceOrStateObj = (JSONObject) addressObj.get("type");
		ProvinceOrState provinceOrState = new ProvinceOrState();
		provinceOrState.setCode((String) provinceOrStateObj.get("code"));
		provinceOrState.setName((String) provinceOrStateObj.get("name"));

		address.setCityOrTown((String) addressObj.get("cityOrTown"));

		JSONObject countryObj = (JSONObject) addressObj.get("country");
		Country country = new Country();
		country.setCode((String) countryObj.get("code"));
		country.setName((String) countryObj.get("name"));

		address.setPostalCode((String) addressObj.get("postalCode"));
		address.setSuburbOrDistrict((String) addressObj.get("suburbOrDistrict"));
		address.setLastUpdated((String) addressObj.get("lastUpdated"));
		address.setType(type);

		address.setCountry(country);

		printAddress.prettyPrintAddressFormat(address, addressObj);
		System.out.println(printAddress.prettyPrintAddress(address));
		System.out.println("------------------------------------------------------------------------------------------------");

		printAddress.prettyPrintAddressType(address,addressObj);

		//printAddress.validateAddress(address, addressObj);


	}

}
