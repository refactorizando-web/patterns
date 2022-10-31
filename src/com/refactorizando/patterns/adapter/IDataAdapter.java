package com.refactorizando.patterns.adapter;

import java.io.IOException;

interface  IDataAdapter {

  String convert(XMLToJSON xml) throws IOException;

}
