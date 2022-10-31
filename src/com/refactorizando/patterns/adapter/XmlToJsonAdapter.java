package com.refactorizando.patterns.adapter;

import java.io.IOException;

public class XmlToJsonAdapter implements IDataAdapter {

  private final XMLToJSON xmlToJSON;

  public XmlToJsonAdapter(XMLToJSON xml){
    this.xmlToJSON = xml;
  }

  public String convert(XMLToJSON xml) throws IOException {
    return this.xmlToJSON.convertToJSONFromXML();
  }

}
