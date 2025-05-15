package com.example.vanillatransformer.service.mappings.process;

import com.example.vanillatransformer.service.mappings.process.tasks.callactivity.CalledElementMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
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

import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class TransactionMapping implements Mapping<TTransaction,TTransaction> {

    private static Logger LOG = LoggerFactory.getLogger(TransactionMapping.class);

    @Override
    public TTransaction map(TTransaction tTransaction) {
        LOG.info("TODO: Manually map bpmn:transaction with id={} - Transaction is not supported by Camunda 8",tTransaction.getId());
        return tTransaction;
    }

}
