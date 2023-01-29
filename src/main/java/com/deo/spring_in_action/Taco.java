package com.deo.spring_in_action;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    public String name;
    private List<Ingredient> ingredients;
}
