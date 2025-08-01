package com.imc.body_calculator.mapper;

import java.util.List;

public interface Mapper <T,U>{

    U map(T t);

    default List<U> mapList(List<T> list){
        return list.stream()
                .map(this::map)
                .toList();
    }
}
