package com.korit.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachPrinter2<E> {

    private E data;

    public static <T> List<T> print(List<T> datas, Consumer<List<T>> action) {
        List<T> result = new ArrayList<T>();

        action.accept(datas);

        return result;
    }
}
