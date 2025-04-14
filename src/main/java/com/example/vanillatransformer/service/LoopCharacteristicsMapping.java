package com.example.vanillatransformer.service;

import com.example.vanillatransformer.exception.BPMNParseException;
import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import com.example.vanillatransformer.util.CustomNamespacePrefixMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import xml.*;

import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class LoopCharacteristicsMapping implements Mapping<TLoopCharacteristics,TLoopCharacteristics> {

    private static Logger LOG = LoggerFactory.getLogger(LoopCharacteristicsMapping.class);


    @Autowired
    private ExpressionMapping expressionMapping;

    @Override
    public TLoopCharacteristics map(TLoopCharacteristics loopCharacteristics) {
        LOG.info("MAPPING: LoopCharacteristics with id={}",loopCharacteristics.getId());
        if(loopCharacteristics instanceof TMultiInstanceLoopCharacteristics){
            ExtensionElements extensionElements = new ExtensionElements();
            var elements = extensionElements.getAnies();

            LoopCharacteristics zeebeLoopCharacteristics = new LoopCharacteristics();

            if(loopCharacteristics.getOtherAttributes().get(Camunda7Constants.CAMUNDA_LOOP_COLLECTION) != null) {
                zeebeLoopCharacteristics.setInputCollection("= " +
                        expressionMapping.map(loopCharacteristics.getOtherAttributes().get(Camunda7Constants.CAMUNDA_LOOP_COLLECTION)));
            }
            if(((TMultiInstanceLoopCharacteristics) loopCharacteristics).getLoopCardinality() != null){
                zeebeLoopCharacteristics.setInputCollection("= for i in 1.." +
                        expressionMapping.map(((TMultiInstanceLoopCharacteristics) loopCharacteristics).getLoopCardinality().getValue().getContent().get(0).toString()) + " return i");
            }

            LOG.info("TODO: set InputElement=?? for zeebe:LoopCharacteristics in element with id={}", loopCharacteristics.getId());
            try {
                JAXBContext context = JAXBContext.newInstance(LoopCharacteristics.class);
                DOMResult res = new DOMResult();
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
                marshaller.marshal(zeebeLoopCharacteristics, res);
                Element elt = ((Document)res.getNode()).getDocumentElement();
                elements.add(elt);
                loopCharacteristics.setExtensionElements(extensionElements);
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
            loopCharacteristics.setExtensionElements(extensionElements);
        }else if(loopCharacteristics instanceof TStandardLoopCharacteristics){
            LOG.info("MAPPING MISSING: bpmn:standardLoopCharacteristics with id={}",loopCharacteristics.getId());
        }
        return loopCharacteristics;
    }

}
