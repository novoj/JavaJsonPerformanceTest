package org.novoj.json.transformer.jsonLib;


import net.sf.json.JsonConfig
import net.sf.json.processors.JsonBeanProcessor
import net.sf.json.processors.JsonValueProcessor

public class DateJsonValueProcessor implements JsonValueProcessor {
   private JsonBeanProcessor processor;

   public DateJsonValueProcessor() {
      processor = new DateJsonBeanProcessor();
   }

   public Object processArrayValue( Object value, JsonConfig jsonConfig ) {
      return process( value, jsonConfig );
   }

   public Object processObjectValue( String key, Object value, JsonConfig jsonConfig ) {
      return process( value, jsonConfig );
   }

   private Object process( Object value, JsonConfig jsonConfig ) {
      return processor.processBean( value, jsonConfig );
   }
}