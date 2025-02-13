package com.example.vanillatransformer.service.abstractmappings;

public class NoMapping<A> implements Mapping<A,A> {

    @Override
    public A map(A a) {
        return a;
    }
}
