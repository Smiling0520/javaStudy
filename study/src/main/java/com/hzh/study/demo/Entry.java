package com.hzh.study.demo;

public class Entry<K, V> {

    public K k;
    public V v;
    public Entry next;

    public Entry() {};

    public Entry(K k, V v) {
        this.k = k;
        this.v = v;
    }
}
