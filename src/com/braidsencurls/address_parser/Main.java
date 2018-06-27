package com.braidsencurls.address_parser;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Country c1 = new Country();
		c1.setCountryCode("US");
		c1.setState("Las Vegas");
		c1.setStreet("Heaven St");
		c1.setPoBox("UEUE0883");
		
		
		Country c2 = new Country();
		c2.setCountryCode("MY");
		c2.setState("Selangor");
		c2.setStreet("Petaling St");
		c2.setPoBox("MMMSD033");
		
		ParserManager parserManager = new ParserManager();
		IAddressParser parser = parserManager.getParser(c1.getCountryCode());
		System.out.println(Arrays.toString(parser.parseAddress(c1)));
		
		parser = parserManager.getParser(c2.getCountryCode());
		System.out.println(Arrays.toString(parser.parseAddress(c2)));
	}

}
