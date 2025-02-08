package com.example.vanillatransformer.service;

/**
 * Maps XML Element of Type A to XML Element of Type B
 * @param <A>
 * @param <B>
 */
public interface Mapping<A, B> {
    public B map(A a);
}
