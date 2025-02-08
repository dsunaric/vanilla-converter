package com.example.vanillatransformer.service;

public class NoMapping<A> implements Mapping<A,A> {

    @Override
    public A map(A a) {
        return a;
    }
}
