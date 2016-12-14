package ua.kpi.hashMap;

import org.junit.Before;

import java.util.Map;

import static org.junit.Assert.*;

public class MyHashMapTest {
    Map<Integer, Integer> empty;
    Map<Integer, Integer> map1;
    Map<Integer, Integer> map2;
    Map<Integer, Integer> map3;

    @Before
    public void init() {
        empty = new MyHashMap<Integer, Integer>();
        map1 = new MyHashMap<Integer, Integer>() {{
            put(1, 11);
        }};
        map2 = new MyHashMap<Integer, Integer>() {{
            put(1, 11);
            put(2, 22);
        }};
        map3 = new MyHashMap<Integer, Integer>() {{
            put(1, 11);
            put(2, 22);
            put(3, 33);
        }};
    }
}