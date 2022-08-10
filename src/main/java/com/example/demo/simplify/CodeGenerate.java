package com.example.demo.simplify;

import java.util.concurrent.atomic.AtomicInteger;

public class CodeGenerate {
    private final AtomicInteger integer = new AtomicInteger();

    public String generate() {
        return "" + integer.incrementAndGet();
    }

    public long newId() {
        return integer.incrementAndGet();
    }
}
