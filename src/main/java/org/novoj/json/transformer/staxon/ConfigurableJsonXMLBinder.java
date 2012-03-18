package org.novoj.json.transformer.staxon;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLInputFactory;
import de.odysseus.staxon.json.JsonXMLOutputFactory;
import de.odysseus.staxon.json.jaxb.JsonXML;
import de.odysseus.staxon.json.jaxb.JsonXMLBinder;
import de.odysseus.staxon.json.jaxb.JsonXMLRootProvider;
import de.odysseus.staxon.json.stream.JsonStreamFactory;
import groovy.lang.Closure;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: ConfigurableJsonXMLMapper,12.2.12 13:22 u_jno Exp $
*/
public class ConfigurableJsonXMLBinder extends JsonXMLBinder {
    private JsonXMLRootProvider rootProvider;
    private Closure<JsonStreamFactory> factoryFactory;

    ConfigurableJsonXMLBinder(JsonXMLRootProvider rootProvider, boolean writeDocumentArray, Closure<JsonStreamFactory> factoryFactory) {
        super(rootProvider, writeDocumentArray);
        this.rootProvider = rootProvider;
        this.factoryFactory = factoryFactory;
    }

    @Override
    protected JsonXMLInputFactory createInputFactory(Class<?> type, JsonXML config) throws JAXBException {
        JsonStreamFactory streamFct = this.factoryFactory.call();
        return new JsonXMLInputFactory(toJsonXMLConfig(type, config), streamFct);
    }

    @Override
    protected JsonXMLOutputFactory createOutputFactory(Class<?> type, JsonXML config) throws JAXBException {
        JsonStreamFactory streamFct = this.factoryFactory.call();
        return new JsonXMLOutputFactory(toJsonXMLConfig(type, config), streamFct);
    }

    private JsonXMLConfig toJsonXMLConfig(Class<?> type, JsonXML config) throws JAXBException {
        return new JsonXMLConfigBuilder().
                autoArray(config.autoArray()).
                multiplePI(true).
                namespaceDeclarations(config.namespaceDeclarations()).
                namespaceSeparator(config.namespaceSeparator()).
                prettyPrint(config.prettyPrint()).
                virtualRoot(config.virtualRoot() ? (QName)rootProvider.getName(type) : (QName)null).
                build();
    }


}
