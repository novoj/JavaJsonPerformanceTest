package org.novoj.json.transformer.staxon;

import de.odysseus.staxon.json.jaxb.JsonXML;
import de.odysseus.staxon.json.jaxb.JsonXMLBinder;
import de.odysseus.staxon.json.jaxb.JsonXMLMapper;
import de.odysseus.staxon.json.jaxb.JsonXMLRootProvider;
import de.odysseus.staxon.json.stream.JsonStreamFactory;
import groovy.lang.Closure;

import javax.xml.bind.JAXBException;

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: ConfigurableJsonXMLMapper,12.2.12 13:22 u_jno Exp $
*/
public class ConfigurableJsonXMLMapper<T> extends JsonXMLMapper<T> {
    private static Closure<JsonStreamFactory> factoryFactory;

    static void setStreamFactoryFactory(Closure<JsonStreamFactory> factoryClosure) {
         factoryFactory = factoryClosure;
    }

    ConfigurableJsonXMLMapper(Class<T> type) throws JAXBException {
        super(type);
    }

    ConfigurableJsonXMLMapper(Class<T> type, JsonXML config) throws JAXBException {
        super(type, config);
    }

    @Override
    protected JsonXMLBinder createBinder(JsonXML config) {
        return new ConfigurableJsonXMLBinder(new JsonXMLRootProvider(), true, factoryFactory);
    }


}
