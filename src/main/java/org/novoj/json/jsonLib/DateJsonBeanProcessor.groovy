package org.novoj.json.jsonLib;


import net.sf.json.JSONObject
import net.sf.json.JsonConfig
import net.sf.json.processors.JsonBeanProcessor

public class DateJsonBeanProcessor implements JsonBeanProcessor {

	/**
	 * Processes the input bean into a compatible JsDate.<br>
	 */
	public JSONObject processBean(Object bean, JsonConfig jsonConfig) {
		JSONObject jsonObject;
		if(bean instanceof Date) {
			jsonObject = new JSONObject()
			jsonObject.element("time", ((Date)bean).time)
		} else {
			jsonObject = new JSONObject(true);
		}
		return jsonObject;
	}
}