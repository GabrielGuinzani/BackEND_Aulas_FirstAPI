package com.satc.satc.loja.repository;

import com.querydsl.core.types.Predicate;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface CustomQuerydslPredicateExecutor<T> extends QuerydslPredicateExecutor {
    @Override
    List<T> findAll(Predicate predicate);
}
