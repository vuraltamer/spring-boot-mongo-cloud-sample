package com.project.main.util;

import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;

public class MongoUtil {

    public static Sort sortDescending(String descendingParameter) {
        return Sort.by(Sort.Direction.DESC, descendingParameter);
    }

    public static ExampleMatcher getMatchingAllContainsStringMatcher() {
        return ExampleMatcher.matchingAll()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnoreCase();
    }
}
