package com.example.demo.handler;

/**
 * Created by GYH on 2021/8/26
 */
public interface DbFunction<R, T1, T2> {
    R apply(T1 t1, T2 t2);
}
