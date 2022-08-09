package com.hzh.study.demo.hashMapDemo;

/**
 * @Author huzhenhua
 * @CreateTime 2022-08-09 23:55:10
 * @Description 手写hashmap
 */
public class HuHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;

    private Entry<K, V>[] table = new Entry[DEFAULT_CAPACITY];

    private int size = 0;

    public int size() {
        return this.size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public V get(K k) {
        int hashKey = k.hashCode();
        int i = hashKey % table.length;
        for (Entry<K, V> entry = table[i]; entry != null; entry = entry.next) {
            if (entry.k.equals(k) && entry.k.hashCode() == k.hashCode()) {
                return entry.v;
            }
        }
        return null;
    }
}
