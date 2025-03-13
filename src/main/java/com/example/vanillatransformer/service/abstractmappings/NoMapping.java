package com.example.vanillatransformer.service.abstractmappings;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class NoMapping<A> implements Mapping<A,A> {

    @Override
    public A map(A a) {
        return a;
    }
}
