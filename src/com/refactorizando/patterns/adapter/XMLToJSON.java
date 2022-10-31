package com.refactorizando.patterns.adapter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;

public class XMLToJSON {

  public XMLToJSON(String xml) {
    this.xml = xml;
  }


  private final String xml;
  public String convertToJSONFromXML() throws IOException {

    //lógica para convertir a JSON

    XmlMapper xmlMapper = new XmlMapper();
    JsonNode node = xmlMapper.readTree(xml.getBytes());
    ObjectMapper jsonMapper = new ObjectMapper();
    return jsonMapper.writeValueAsString(node);

  }
}
