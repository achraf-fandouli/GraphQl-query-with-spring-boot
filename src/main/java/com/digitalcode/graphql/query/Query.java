package com.digitalcode.graphql.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver{

    public String test() {
        return "Hello GraphQl";
    }
    
    public int sum(int a, int b) {
        return a+b;
    }
}
