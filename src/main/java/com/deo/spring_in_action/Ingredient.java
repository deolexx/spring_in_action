package com.deo.spring_in_action;

import lombok.Data;

@Data
public class Ingredient {
    private String name;
    private String id;
    private Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
