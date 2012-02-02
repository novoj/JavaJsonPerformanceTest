package org.novoj.json.transformer.jsonMarshaller;


import com.twolattes.json.Json;
import com.twolattes.json.types.NullSafeType;

import java.util.Date;

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: DateMarshaller,29.1.12 16:06 u_jno Exp $
 */
public class DateMarshaller extends NullSafeType<Date, Json.Number> {

	@Override
	protected Json.Number nullSafeMarshall(Date entity) {
		return Json.number(entity.getTime());
	}

	@Override
	protected Date nullSafeUnmarshall(Json.Number object) {
		return new Date(object.getNumber().longValueExact());
	}	
	
}
