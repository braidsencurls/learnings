package com.braidsencurls.address_parser;

public class ParserManager {
	
	public IAddressParser getParser(String countryCode) {
		IAddressParser parser = null;
		switch(countryCode) {
		case "US" :
			parser = new USParser();
			break;
		case "MY" :
			parser = new MYParser();
			break;
		}
		return parser;
	}

}
