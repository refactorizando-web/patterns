package com.refactorizando.patterns.adapter;

import java.io.IOException;

public class Application {

  public static String XML_STRING =
      "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
          "<root>" +
          "<firstName>John</firstName>" +
          "<lastName>Snow</lastName>" +
          "<age>25</age>" +
          "<spouse/>" +
          "<address>" +
          "<street>237 Harrison Street</street>" +
          "<city>Brooklyn, NY</city>" +
          "<state>New York</state>" +
          "<postalCode>11238</postalCode>" +
          "</address>" +
          "<phoneNumbers>" +
          "<type>mobile</type>" +
          "<number>212 555-3346</number>" +
          "</phoneNumbers>" +
          "<phoneNumbers>" +
          "<type>fax</type>" +
          "<number>646 555-4567</number>" +
          "</phoneNumbers>" +
          "</root>";

  public static void main(String[] args) throws IOException {

    XMLToJSON xmlToJSON = new XMLToJSON(XML_STRING);

    IDataAdapter adapter = new XmlToJsonAdapter(xmlToJSON);
    String json = adapter.convert(xmlToJSON);

    System.out.println(json);
  }
}
