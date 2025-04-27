package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import xml.Subscription;

@Setter
@Getter
@Component
public class SubscriptionMapping implements Mapping<String, Subscription> {

    private static Logger LOG = LoggerFactory.getLogger(SubscriptionMapping.class);


    @Override
    public Subscription map(String correlationKey) {
        LOG.info("MAPPING: zeebe:subscription with correlationKey={} ",correlationKey);

        Subscription subscription = new Subscription();
        subscription.setCorrelationKey(correlationKey);

        LOG.info("TODO: set correlationKey=?? in zeebe:subscription Element");
        return subscription;
    }


}
