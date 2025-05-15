package com.example.vanillatransformer.service.mappings.process;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.TGateway;

@Setter
@Getter
@Component
public class GatewayMapping implements Mapping<TGateway,TGateway> {

    @Autowired
    private NoMapping noMapping;

    private static Logger LOG = LoggerFactory.getLogger(GatewayMapping.class);
    @Override
    public TGateway map(TGateway tGateway) {
        LOG.info("MAPPING: bpmn:gateway with id={}",tGateway.getId());

        return (TGateway) noMapping.map(tGateway);
    }

}
